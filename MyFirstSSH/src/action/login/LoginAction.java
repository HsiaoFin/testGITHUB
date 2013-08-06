package action.login;

import com.opensymphony.xwork2.ActionSupport;

import service.system.UserService;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 3989633817331294940L;
	//封装用户请求参数的两个属性，username和password
	private String username;
	private String password;
	//声明在applicationContext.xml中所定义的业务逻辑组件
	//UserService对应zjuserver
	private UserService zjuserver = new UserService();
	
	//设置注入业务逻辑组件的各种方法，可让Spring来管理action和UserService组件的依赖关系
	public UserService getUserService() {
		return zjuserver;
	}
	public void setUserService(UserService zjuserver) {
		this.zjuserver = zjuserver;
	}
	public String getUsername() {
	  return username;
	}
	public void setUsername(String username) {
	  this.username = username;
	}
	public String getPassword() {
	  return password;
	}
	public void setPassword(String password) {
	  this.password = password;
	}
	//处理用户请求的execute方法
	public String execute(){
		boolean flag = false;
			if (username == null || username.trim().equals("")) {
				this.addFieldError("username", "用户名不能为空");
				return "fail";
				} else if (password == null || password.trim().equals("")) {
					this.addFieldError("password", "密码不能为空");
					return "fail";
				} else {
					//action调用userService的checkUser方法验证，要与数据库的验证。在UserDao.java中。
					flag = zjuserver.checkUser(username, password);
					if (flag) {
						return "success";
					} else {
						return "fail";
					}
				}
	}
						
}
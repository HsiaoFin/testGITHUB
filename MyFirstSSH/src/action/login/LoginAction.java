package action.login;

import com.opensymphony.xwork2.ActionSupport;

import service.system.UserService;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 3989633817331294940L;
	//��װ�û�����������������ԣ�username��password
	private String username;
	private String password;
	//������applicationContext.xml���������ҵ���߼����
	//UserService��Ӧzjuserver
	private UserService zjuserver = new UserService();
	
	//����ע��ҵ���߼�����ĸ��ַ���������Spring������action��UserService�����������ϵ
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
	//�����û������execute����
	public String execute(){
		boolean flag = false;
			if (username == null || username.trim().equals("")) {
				this.addFieldError("username", "�û�������Ϊ��");
				return "fail";
				} else if (password == null || password.trim().equals("")) {
					this.addFieldError("password", "���벻��Ϊ��");
					return "fail";
				} else {
					//action����userService��checkUser������֤��Ҫ�����ݿ����֤����UserDao.java�С�
					flag = zjuserver.checkUser(username, password);
					if (flag) {
						return "success";
					} else {
						return "fail";
					}
				}
	}
						
}
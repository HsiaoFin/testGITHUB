package dao.system;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import my.ssh.Firstssh;
//1、HibernateDaoSupport是spring为hibernate的DAO提供的工具类
//2、

public class UserDao extends HibernateDaoSupport{
	public void add(Firstssh m)
	{
		getHibernateTemplate().save(m);
	}
	@SuppressWarnings("unchecked")
	public List<Firstssh> showAllUsers()
	{
		return getHibernateTemplate().find("from user");
	}
	public void update(Firstssh m)
	{
	    getHibernateTemplate().update(m);
	}
	public void delete(String id)
	{
		getHibernateTemplate().delete(getHibernateTemplate().get(Firstssh.class, id));
	}
	
	public Firstssh getUserById(String id)
	{
		Firstssh m=(Firstssh)getHibernateTemplate().get(Firstssh.class, id);
	return m;
	}

//普通用户登录验证方法
@SuppressWarnings("unchecked")
public boolean checkUser(String userName,String userPassword){
  boolean flag = false;
  String hql = "from Firstssh as user where user.name = '"+userName+"' and user.password = '"+userPassword+"'";
  List<Firstssh> userList = this.getHibernateTemplate().find(hql);
  if(userList.size()>0){
   flag = true;
  }
  return flag;
}
}


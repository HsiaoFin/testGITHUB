package service.system;

import dao.system.UserDao;

public class UserService{
private UserDao userDao;

	public boolean checkUser(String userName,String userPassword)
	{
		return userDao.checkUser(userName, userPassword);
	}
	public UserDao getUserDao() {
	return userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}  
}

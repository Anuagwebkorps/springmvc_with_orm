package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User1;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int CreateUser(User1 user)
	{
		return this.userDao.SaveUser(user);
	}
	public void DelUser(User1 user)
	{
		 this.userDao.DeleteUser(user);
	}
}

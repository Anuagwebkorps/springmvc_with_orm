package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User1;
@Repository
public class UserDao {
	@Autowired
     private HibernateTemplate hibernateTemplate;
	@Transactional
	public int SaveUser(User1 user)
	{
		Integer i=(Integer) this.hibernateTemplate.save(user);
		return i;
	}
	@Transactional
	public void DeleteUser(User1 user)
	{
		this.hibernateTemplate.delete(user);
	
	}
}

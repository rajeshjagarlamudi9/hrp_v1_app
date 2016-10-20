package com.hrp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.hrp.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	@SuppressWarnings("unchecked")
	public List<User> loginUser(String username){
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("email", username));
		List<User> useList = criteria.list();
		return useList;
	}
	public void registerUser(User user){
		save(user);
	}

}

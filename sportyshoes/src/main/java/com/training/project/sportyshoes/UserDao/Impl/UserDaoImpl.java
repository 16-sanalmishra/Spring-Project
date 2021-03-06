package com.training.project.sportyshoes.UserDao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.training.project.sportyshoes.UserDao.UserDao;
import com.training.project.sportyshoes.entity.Product;
import com.training.project.sportyshoes.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	 HibernateTemplate ht;
	
	@Override
	public int create(User user) {
		return (int) ht.save(user);
	}

	@Override
	public List<User> listUp() {
		
		return ht.loadAll(User.class);
	}

	@Override
	public List<Product> listUpProd() {
		return ht.loadAll(Product.class);
	}
	
	
}

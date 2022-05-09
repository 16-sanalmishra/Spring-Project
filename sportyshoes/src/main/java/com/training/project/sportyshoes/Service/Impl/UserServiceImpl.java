package com.training.project.sportyshoes.Service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.project.sportyshoes.Service.UserService;
import com.training.project.sportyshoes.UserDao.UserDao;
import com.training.project.sportyshoes.entity.Product;
import com.training.project.sportyshoes.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao ud;

	@Override
	@Transactional
	public int save(User user) {
		return ud.create(user);
	}

	@Override
	public List<User> getUser() {
		return ud.listUp();
	}

	@Override
	@Transactional
	public List<Product> getProd() {
		return ud.listUpProd();
	}

	@Override
	public int saveProd(Product user) {
		
		return 0;
	}
}

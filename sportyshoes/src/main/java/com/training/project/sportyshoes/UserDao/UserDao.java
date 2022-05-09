package com.training.project.sportyshoes.UserDao;

import java.util.List;

import com.training.project.sportyshoes.entity.Product;
import com.training.project.sportyshoes.entity.User;

public interface UserDao {

	int create(User user);
	List<User> listUp();
	List<Product> listUpProd();
	
}

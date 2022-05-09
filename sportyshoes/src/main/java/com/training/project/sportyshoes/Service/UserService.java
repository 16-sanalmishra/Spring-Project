package com.training.project.sportyshoes.Service;

import java.util.List;

import com.training.project.sportyshoes.entity.Product;
import com.training.project.sportyshoes.entity.User;

public interface UserService {

	int save(User user);
	List<User> getUser();
	int saveProd(Product user);
	List<Product> getProd();

}

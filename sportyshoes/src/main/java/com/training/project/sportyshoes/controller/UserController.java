package com.training.project.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.project.sportyshoes.Service.UserService;
import com.training.project.sportyshoes.entity.Product;
import com.training.project.sportyshoes.entity.User;

@Controller
public class UserController {
	@Autowired 
	UserService us;
	
	@RequestMapping("/userregistration")
	public ModelAndView showFirst() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("chooseUp");
		return mv;
	}

	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "showFirst";
	}
	
	@RequestMapping(value = "/tosomewhere" , method = RequestMethod.POST)
	public String showDetails(@ModelAttribute("user") User user, ModelMap model) {
		us.save(user);
		List<User> users = us.getUser();
		model.addAttribute("users", users);
		
		return "nextStop";
		
	}
	@RequestMapping(value = "/showProduct" , method = RequestMethod.POST)
	public String showProd(@ModelAttribute("product") Product product, ModelMap model) {
		us.saveProd(product);
		List<Product> products = us.getProd();
		model.addAttribute("prod", products);
		
		return "listProduct";
}
	@RequestMapping("/book")
	public String book() {
		return "bookShoe";
	}
	
	@RequestMapping("/payment")
	public String paySuccess() {
		return "paymentDone";
	}
}


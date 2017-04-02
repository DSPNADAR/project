package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopping.dao.CustomerDao;
import com.shopping.model.Customer;
import com.shopping.service.CustomerService;

@Controller
public class Customercontroller {
	
	@Autowired
	CustomerDao cs;
	//CustomerService cs;
	@ModelAttribute("cust")
	public Customer getcustomer(){
		return new Customer();
	}
	@RequestMapping("/addCustomer")
			public String saveCustomer(@ModelAttribute Customer c){
		if(cs.addCustomer(c))
			
				{
			return "home";
				}
		else{
			return "signup";
		}
	}
	@RequestMapping("/signup")
	public String goRegister()
	{
		return "signup";
	}
	

}

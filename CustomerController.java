package com.candidjava.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zalak.bean.Customer;

@Controller
public class CustomerController
{
	@RequestMapping( "/customer")
	public ModelAndView addCustomer(@ModelAttribute("Customer") Customer customer, @RequestParam("name") String name1, @RequestParam("password") String password1)
	{
		
		
		
		customer.setName1("zalak patel");
		ModelAndView model = new ModelAndView("page");

		model.addObject("msg","<font color='blue'>"+ " login sucessfully"+"</font>"+"<br>"+ "your username is " + "<font color='red'>"+name1+"</font>" +"  "+"and your password is " + "<font color='red'>" + password1+"</font>"+
		"<br>" +"created by"+" "+ customer.name1+"<br>"+"<font color='green'>"+"thank you"+"</font>");

		return model;
	}

	

}

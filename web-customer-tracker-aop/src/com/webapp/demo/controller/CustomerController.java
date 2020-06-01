package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.webapp.demo.entity.AdminLogin;
import com.webapp.demo.entity.Customer;
import com.webapp.demo.service.AdminLoginService;
import com.webapp.demo.service.CustomerService;



@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	private AdminLoginService adminLoginService;
	
	@GetMapping("AdminLogin")
	public String AdminLogin(Model model) {
		
		AdminLogin adminLogin = new AdminLogin();
		
		model.addAttribute("adminLogin",adminLogin);
		
		return "admin-login";
	}
	
	@PostMapping("AdminDetailsVerification")
	public String AdminDetailsVerification(@ModelAttribute("adminLogin") AdminLogin theAdminLogin, Model model) {
		
		System.out.println(theAdminLogin.getUserName());
		System.out.println(theAdminLogin.getPassword());
		
		 if(adminLoginService.verifyDetails(theAdminLogin.getUserName(),theAdminLogin.getPassword()))
			 return "list-customers"; 
		 
		 else return "admin-login";
		 

	}
	
	@GetMapping("list")
		public String ListCustomers(Model theModel) {
		
			List<Customer> theCustomers = customerService.getCustomers();
		
			theModel.addAttribute("customers",theCustomers);
			return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer",theCustomer);
		
		return "customer-form";
		
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model theModel) {
		
		Customer theCustomer = customerService.getCustomer(theId);
		
		theModel.addAttribute("customer",theCustomer);
		
		
		return "customer-form";
		
	}
	
	@GetMapping("delete")
	public String DeleteCustomer(@RequestParam("customerId") int theId) {
		
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
		
	}
	
}

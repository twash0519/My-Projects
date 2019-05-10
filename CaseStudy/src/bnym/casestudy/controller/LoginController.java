package bnym.casestudy.controller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import bnym.casestudy.entity.Customer;

import bnym.casestudy.services.customer.CustomerService;





@Controller
public class LoginController {
	
	
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView submitRegistrationForm(@RequestParam Map<String, String> registrationform,
			RedirectAttributes redir) {
		
		String username = registrationform.get("username");
		String password = registrationform.get("password");
		
		if(username.contentEquals("twash0519@hotmail.com") && password.contentEquals("123456")) {
			
			ModelAndView mav = new ModelAndView("redirect:/customerDisplay");
			redir.addFlashAttribute("msg", "Login Successful");
			return mav;
			
		}
		
		
		ModelAndView mav = new ModelAndView("redirect:/");//redirect is a part of the model and redirects the path
		mav.addObject("msg", "Your login was not successful. Please try again");
			return mav;
			
	}

	
	@RequestMapping("/customerDisplay")
	public ModelAndView displayAllCustomers() {
		
		
		ModelAndView model = new ModelAndView("customers");
		List<Customer>customerList = customerService.getAllCustomers();
		
		model.addObject("customerList", customerList);
		return model;
		
		
	}
	
	


}



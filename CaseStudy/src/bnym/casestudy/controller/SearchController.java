package bnym.casestudy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import bnym.casestudy.entity.Customer;
import bnym.casestudy.repository.CustomerRepository;

@Controller
public class SearchController {
	@Autowired
	CustomerRepository customerRepository;
	
	//@PostMapping("/search") short cut
	//	@GetMapping("/search") short cut
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ModelAndView searchProvider(
		@RequestParam String firstName,
		@RequestParam String lastName,
		RedirectAttributes redir) {
		List<Customer> result = new ArrayList<Customer>();
		
		result = customerRepository.findByfirstNameAndLastName(firstName,  lastName);
		
		//if there is a record
		if(result.size() !=0) {
			ModelAndView mav = new ModelAndView("customers");//this is the jsp
			mav.addObject("customerList", result);
			mav.addObject("recordFound", result.size()+" record/s found!");
			mav.addObject("customerDisplay", "<a href='/CaseStudy/customerDisplay'>List All Customers</a>");
			return mav;
		//if there is no record
		}else {
			ModelAndView mav = new ModelAndView("redirect:/customerDisplay"); //this is the model
			redir.addFlashAttribute("noRecord", "No record found!");
			
			//redir is used when you pass something in a redirect to a model
		return mav;
		}
		
	}
		
}

package bnym.casestudy.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	/*
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView getHomePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}*/
	@RequestMapping("/")
	public ModelAndView getIndexPage(Model model, Principal principal) {
		//model.addAttribute("message", "You are logged in as " + principal.getName());
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("/userpage")
	public ModelAndView getUserPage(Model model, Principal principal) {
		//model.addAttribute("message", "You are logged in as " + principal.getName());
		return new ModelAndView("user");
	}
	
	
	@RequestMapping("/adminpage")
	public ModelAndView getAdminPage(Model model, Principal principal) {
		//model.addAttribute("message", "You are logged in as " + principal.getName());
		return new ModelAndView("user");
	}
}


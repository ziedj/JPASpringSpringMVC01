package com.presentations;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CompanyController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "home";
	}

	@RequestMapping(value = "/helloAction", method = RequestMethod.POST)
	public String respondToHelloAction(@RequestParam Object var, ModelMap model) {
		//String test = (String) model.get("var");

		model.addAttribute("message", (String) var);
		return "helloAction";
	}

	@RequestMapping(value = "/helloAction", method = RequestMethod.GET)
	public String respondToGetHelloAction(@RequestParam Object var, ModelMap model) {
		//String test = (String) model.get("var");

		model.addAttribute("message", (String) var);
		return "helloAction";
	}


}

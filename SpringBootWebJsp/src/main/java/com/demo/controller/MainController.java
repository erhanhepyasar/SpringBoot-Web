package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Alien;

@Controller
public class MainController {
	
//	@ResponseBody
	@RequestMapping()
	public String home() {
		
		return "home";
	}

	
//	@RequestMapping("/welcome")
//	public ModelAndView welcome(@RequestParam("name") String name) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", name);
//		mv.setViewName("welcome");		
//		return mv;
//	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("myalien", alien);
		mv.setViewName("welcome");
		return mv;
	}

}

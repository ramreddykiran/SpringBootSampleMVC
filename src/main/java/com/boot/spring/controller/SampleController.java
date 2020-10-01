package com.boot.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("sample-req")
public class SampleController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleInput(@RequestParam("input") String inputValue) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("input", inputValue);
		mv.setViewName("welcome");
		return mv;
	}
}

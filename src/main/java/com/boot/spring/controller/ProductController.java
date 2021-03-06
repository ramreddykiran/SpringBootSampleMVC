package com.boot.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.boot.spring.domain.Product;

@Controller
@RequestMapping("product")
public class ProductController {

	@RequestMapping("/show-product-details")
	public ModelAndView showProduct(Product product) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("p", product);
		mv.setViewName("product-display");
		return mv;
	}
	
	

}

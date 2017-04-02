package com.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomecontroller{
	@RequestMapping("/")
public ModelAndView welcome(){
	return new ModelAndView("welcome");
}
	@RequestMapping("Register")
	public ModelAndView Register(){
		return new ModelAndView("Register");
}
	@RequestMapping("/login")
	public ModelAndView login(){
		return new ModelAndView("login");
}
	@RequestMapping("/dsp1")
	public ModelAndView dsp1(){
		return new ModelAndView("dsp1");
}
	@RequestMapping("/dsp2")
	public ModelAndView dsp2(){
		return new ModelAndView("dsp2");
}
	@RequestMapping("/dsp3")
	public ModelAndView dsp3(){
		return new ModelAndView("dsp3");
}
	@RequestMapping("/dsp4")
	public ModelAndView dsp4(){
		return new ModelAndView("dsp4");
}
}
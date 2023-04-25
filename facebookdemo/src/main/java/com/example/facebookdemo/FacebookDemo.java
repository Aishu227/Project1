package com.example.facebookdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class FacebookDemo {
	@ResponseBody
	@RequestMapping(value="/signin",method=RequestMethod.GET)
	public String Signin()
	{
		return "Iam inside Signin";
	}
	@ResponseBody
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String Signup()
	{
		return "Iam inside signup";
	}
	
	

}

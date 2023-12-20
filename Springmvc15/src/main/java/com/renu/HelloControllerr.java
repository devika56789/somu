package com.renu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerr {
@RequestMapping("/login")

	public String sayHello()
	{
		return"login";
	}
@RequestMapping("/register")

public String sayrama()
{
	return"register";
}
}


package com.devtool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		
		int a=453;
		int b=22;
		int c=8;
		return" this is inex-indexPage"+(a+b+c);
		
	}
}

package com.lf.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class Test {
	
	
	@RequestMapping(value = "Test.html")
	public void Test(){
		
		System.out.println("00000000000");
		System.out.println("00000000000");
		System.out.println("00000000000");
		System.out.println("00000000000");
		System.out.println("00000000000");
	}

}

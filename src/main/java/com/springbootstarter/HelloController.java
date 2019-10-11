package com.springbootstarter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	
	//@RequestMapping maps only to get method by default.To map any other methods we have to specify it in annotation.
	
	@RequestMapping("/hello")
	public String getMessage() {
		return "Hello World";
	}
	
	

}

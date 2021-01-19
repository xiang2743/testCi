package com.example.ci;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ccneko
 * @since 2020/3/14 17:57
 */
@RestController
public class HelloController{

	@RequestMapping("/")
	public String index(){
		return "Hello World!";
	}

}
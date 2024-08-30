package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.User;

import jakarta.annotation.PostConstruct;

@RestController
public class HomeController {
			
//	@GetMapping("/users")
//	public String getuser() {
//		return "Hi Spring Boot";
//	}
//	
//@GetMapping("/mark")
//public int addMark(@RequestParam("a")int op1 ,@RequestParam("b") int op2) {
//return op1+op2;
//
//}
//@GetMapping("/sub")
//public int  subraction(@RequestParam("a") int op1 ,@RequestParam("b")int op2 ) {
//    return op1-op2;
//}
//@GetMapping("/mul/{a}/{b}")
//public int multiplay(@PathVariable("a") int op1 ,@PathVariable("b")int op2 ) {
//    return op1*op2;
//}
		
	@PostMapping("/save")
	public String saveUserData(@RequestBody User users) {
		if(users.getUserName().equals("deepak")) {
			return "valid userName";		
		}
		return "Invalid User";
	}
	

}
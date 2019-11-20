package chuancy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chuancy.service.FeignService;

@RestController
public class IndexController {
	
	@Autowired
	private FeignService feignService;
	
	@RequestMapping("/index")
	public String index(String name){
		return feignService.client(name);
	}
}

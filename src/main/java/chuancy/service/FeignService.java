package chuancy.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("SpringCloud-EurekaClient")
public interface FeignService {
	
	@RequestMapping("/client")
	public String client(@RequestParam("name")String name);
}

package chuancy.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService{

	@Override
	public String client(String name) {
		return "feign-->name:"+name+"系统错误，调用接口失败！";
	}

}

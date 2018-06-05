package com.sbh.sitemenitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.sbh.sitemenitoring.service.HelloService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ManagedBean
public class HelloController {

	@ManagedProperty("#{helloService}")
	private HelloService helloService;
	
	public String sayHello() {
		return helloService.sayHello();
	}
}
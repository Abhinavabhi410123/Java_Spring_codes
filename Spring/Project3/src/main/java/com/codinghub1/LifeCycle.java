package com.codinghub1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LifeCycle {

	public LifeCycle() {
		System.out.println("bean created");
	}
	@PostConstruct
	public void hi() {
		System.out.println("init method");
	}
	@PreDestroy
	public void hello() {
		System.out.println("Im destroy");
	}
}

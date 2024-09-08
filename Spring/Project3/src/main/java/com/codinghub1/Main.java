package com.codinghub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/codinghub1/Config.xml");
	//LifeCycle l = context.getBean("l1",LifeCycle.class);
	context.registerShutdownHook();
}
}

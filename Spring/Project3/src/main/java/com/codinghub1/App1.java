package com.codinghub1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App1 {
	public static void main(String[]args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Student s = ac.getBean(Student.class);
		Student s1 = ac.getBean(Student.class);
		//System.out.println(s);
		System.out.println(s);
		//s.display();
	}
}

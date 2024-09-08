package com.codinghub1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class MyConfig {
	@Bean
	@Qualifier("roll")
	public int id() {
		return 10;
	}
	@Bean
	@Qualifier("name")
	public String name() {
		return "Abhi";
	}
	@Bean
	@Qualifier("o_id")
	public int oid() {
		return 12;
	}
	@Bean
	@Qualifier("o_name")
	public String o_name() {
		return "Sai";
	}
	@Bean
	@Primary
		public Student s1(@Qualifier("roll") int id,@Qualifier("o_name") String name) {
			return new Student(id,name);
		}
	@Bean
		public Student s2() {
			return new Student(13,"ravi");
		}
	@Bean
		public Student s3() {
			return new Student(14,"kiran");
		}
}

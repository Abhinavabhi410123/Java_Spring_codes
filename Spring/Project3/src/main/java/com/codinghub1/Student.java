package com.codinghub1;

public class Student {
int id;
String name;


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}


public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public void display() {
	System.out.println(this.id);
	System.out.println(this.name);
}
}

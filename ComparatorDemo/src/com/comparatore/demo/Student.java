package com.comparatore.demo;

public class Student implements Comparable<Student>{

	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s) {
		if(this.id>s.id)
		return 1;
		return -1;
	}
	
	
}

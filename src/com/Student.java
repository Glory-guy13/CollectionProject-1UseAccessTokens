package com;

public class Student {
	int id;
	String name;
	Double marks;
	
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks=marks;
	}


	@Override
	public String toString() {
		return "Id:"+id+"\tName:"+name+"\tMarks:"+marks;
	}
}

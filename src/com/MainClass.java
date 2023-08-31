package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {

		Student s1 = new Student(1,"thor",86);
		Student s2 = new Student(3,"hulk",69);
		Student s3 = new Student(2,"yash",96);
		Map<Integer,Student> map = new LinkedHashMap<Integer,Student>();
		map.put(s1.id,s1 );
		map.put(s2.id,s2);
		map.put(s3.id,s3 );

		//		Converting map into set of keys using keySet()
		Set<Integer> keys = map.keySet();

		//		Creating instance of arraylist and storing it into list reference
		List<Student> list = new ArrayList<Student>();

		//		traversing keys from Set
		for (Integer integer : keys) {
			//			getting values(Student object)
			Student std = map.get(integer); 
			//			Adding value(Student object) into Arraylist
			list.add(std);
			//			printing value(Student object)
			System.out.println(std);
		}

		System.out.println("-=-==-==-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your option\n1.Sort by id\n2.Sort by name\n3.Sort by Marks\n4.exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1 : 
				Collections.sort(list , new SortStudentById());
				for (Student student : list) {
					System.out.println(student);
				}
				System.out.println("-----------------------------");
				break;
			case 2 : 
				Collections.sort(list , new SortStudentByName());
				for (Student student : list) {
					System.out.println(student);
				}
				System.out.println("-----------------------------");
				break;
			case 3 : 
				Collections.sort(list , new SortStudentByMarks());
				for (Student student : list) {
					System.out.println(student);
				}
				System.out.println("-----------------------------");
				break;
			case 4 : 
				System.exit(0);
			default:System.out.println("enter valid option");
			break;
			}
			
		}
	}

}

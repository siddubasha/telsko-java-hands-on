package com.comparatore.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List list= new ArrayList<>();
		
		list.add(25);
		list.add(5);
		list.add(21);
		list.add(69);
		Comparator<Student> c1= new Comparator<>() {
/*   if we want to sort Custom object we can use Compare interface or we can use Comparable interface but student class must implement comp[arable interface,
 *  when we use comparable Comparator is overided ( no use  comparator)
 *  */
			@Override 
			public int compare(Student s1, Student s2) {
               if(s1.id > s2.id)
            	   return 1;
               else
				return -1;
			}
           
		/*	@Override // it is used to sort the list of numbers based on last digit example output: [21, 5, 25, 69] ,  no need to override for natural sorting
			public int compare(Integer a,Integer b) {
				if(a%10>b%10)
					return 1;
				return -1;
			} */

			
		};
		
		//Collections.sort(list, c1);
		//System.out.println(list);
		System.out.println("**************************************");
		
		List<Student> students= new ArrayList<>();
		
		students.add(new Student(5,"siddu"));
		students.add(new Student(2,"raju"));
		students.add(new Student(58,"basha"));
		students.add(new Student(25,"guna"));
		
		//System.out.println(students);
		
		
		//Collections.sort(students,c1); // using comparator
		
		Collections.sort(students);
		for (Student student : students) {
			System.out.println(student);
		}
	}
}

package org.pkk.ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentImpl {

	public static void main(String[] args) {
	
		Student s1 = new Student(101, "Ravi", 23);
		Student s2 = new Student(202, "raj", 33);
		Student s3 = new Student(22, "rohan", 44);
		
		List li = new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		Iterator itr = li.iterator();
		while(itr.hasNext()){
			Student st = (Student) itr.next();
			System.out.println("Roll Number >> " + st.rollNo + "\t Name >> " + st.name + "\t Age >> " + st.age);
			
			
			
		}
		
		
		
		
	}

}

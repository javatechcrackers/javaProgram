package org.pkk.string;

public class StringDemo {

	public static void main(String[] args) {
		String s= "prashant";
		String s2= new String("prashant");
		String s3= "prashant";
		String s4= s;
		System.out.println(s.equals(s2) + " " + (s==s2));
		System.out.println(s2.equals(s3) + " " + (s2==s3));
		System.out.println(s.equals(s4) + " " + (s==s4));
	}

}

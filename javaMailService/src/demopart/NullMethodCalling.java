package demopart;

//if we have two method 1st accepting the object and 2nd accpting string 
//so if we are passing null then which method will gets call
//ans is String method
//if null then will call String method but if 0 then will call object method

public class NullMethodCalling {   
	public static void main(String[] args) {   
		method(0);   
		
		NullMethodCalling t = new NullMethodCalling();
		System.out.println(t);
		method(t);  
		}   
	public static void method(Object o) {    
		System.out.println("Object impl");     }  
	public static void method(String s) {  
		System.out.println("String impl");     } } 

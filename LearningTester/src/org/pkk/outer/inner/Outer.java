package org.pkk.outer.inner;

public class Outer {
	String user="ravi";
	static String name="pkk";
	public void m2(){
		System.out.println("Outer method" + name);
	}
	
	
	static class Inner{
		public void m2(){
			name = name + "kk";
			System.out.println("Inner method Static >> " + name );
			
			//this will not work
			//System.out.println("Inner method non-static >> " + user );
		}
	}
	
	
	public static void main(String[] args) {
	
		Outer.Inner inner = new Outer.Inner();
		inner.m2();
	}

}

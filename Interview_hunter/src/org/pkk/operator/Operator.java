package org.pkk.operator;

public class Operator {
	
	public static boolean getOperator(boolean op){
		return op?true:false;
		
	}

	public static void main(String[] args) {
		boolean a= true; boolean b = false;
		
		boolean c= a ? (b?a : true)  : (a?b : false);
		// c=t ? t : f
		System.out.println("C :: " + c);
		System.out.println("Method :: " + getOperator(c));
		System.out.println("Method 2 :: " + getOperator(false));
	}

}

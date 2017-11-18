package org.pkk.general;

public class FibonnaciSeries {
	//	0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		
		int n=100;
		int i=0,j=1,s=0;
		System.out.print(i +","+j);
		for(int k=0; k<=100; k++){
			s=i+j;
			System.out.print(","+s);
			i =j;
			j=s;
			
		}
	}

}

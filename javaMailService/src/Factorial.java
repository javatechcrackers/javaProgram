import java.util.Scanner;

//package java.beginner;

public class Factorial {

	public static float fact(float n1){
		float n = n1;
		while(n > n1){
		 n  = n * fact(n1-1);
		}
		//System.out.println(n);
		return (float) n;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
       Scanner d=new Scanner(System.in);
       float n=d.nextFloat();
		int i=d.hashCode();
		String k=d.toString();
		float j=fact(n);
		System.out.println(j);
		System.out.println(i);
		System.out.println(k);
	}

}

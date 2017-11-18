package day2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a,b,k;
        		a = scan.nextInt();
             b =scan.nextInt();
             k = scan.nextInt();
   
	int sum =0 ;	
    for(int i = a ; i<=b ; i++)
    {
    	sum = sum +k ;
    }
		System.out.println(sum/b+1 - a);
	}

}

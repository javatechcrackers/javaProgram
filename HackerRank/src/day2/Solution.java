package day2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int j;
		double k;
		String name = null;
		String total;
		/* Read and save an integer, double, and String to your variables. */
		j = scan.nextInt();
		k = scan.nextDouble();
		name = scan.nextLine();
		/*while(scan.hasNext()){
		name = name + scan.next();
		}*/
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + j);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + k);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		
	/*	while(scan.hasNext()){
            System.out.println("line : "+scan.next());
        }*/
		
		name = s.concat(name);
		System.out.println(name);

		scan.close();
	}
}

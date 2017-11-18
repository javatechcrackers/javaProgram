package ChallangeProgram;

import java.util.Scanner;

import javax.swing.JOptionPane;


/*
 * 3.	Finding the length between 2 integer in the string.

Eg:- enter no: 451276
Enter 2 integer:5 7
Length between 5 and 7: 3
 * 
 */
public class LengthofBetweenNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x ; int y;
		String a = JOptionPane.showInputDialog(null, "Enter No");
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter No 1"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter No 2 "));
		
		x=a.substring(b, c);
		
		y = c-b;
		
		System.out.println(y);
	}

}

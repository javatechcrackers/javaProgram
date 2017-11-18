package general;

import java.util.StringTokenizer;

public class StringDemo {

	
	public static void main(String[] args) {
		String numbers = "PRASHANT";
		char ch[] = new char[numbers.length()];
		for(int j=0; j< numbers.length();j++){
			ch[j]=numbers.charAt(j);
			
		}
		
		for(int i=0 ; i<numbers.length();i++){
			//String padded = String.format("%-20s", ch[i]);
		//	System.out.println("%-20s" + ch[i] );
			//System.out.println(padded );
			for(int j=0 ; j<i;j++){
			System.out.print(" ");
			}
			System.out.println(ch[i]);
		}
	}

}

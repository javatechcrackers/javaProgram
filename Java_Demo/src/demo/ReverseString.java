package demo;

import java.util.Arrays;

public class ReverseString {
	
	public String reverse(String str){
		System.out.println("from reverse method");
		int len=str.length();
		char []c=new char[len];
		for(int j=len-1,i=0;j>=0 ;j--,i++){
		    c[i]=str.charAt(j);
		}
		str=String.copyValueOf(c);
		char[] aa = c;
		System.out.println(str);
		System.out.println(aa);
		System.out.println(c);
		
		return str;
		
	}
	
	public String reverse2ndway(String str){
		System.out.println("from reverse2ndway method");
		int len=str.length();
		char []c=new char[len];
		for(int j=len-1,i=0;j>=0 ;j--,i++){
		    c[i]=str.charAt(j);
		    System.out.print(c[i]);
		}
		/*String st = c.toString();
		System.out.println("from reverse2ndway method" +c);*/
		/*for(int k=len-1; k>0;k--){
			System.out.print(c[k]);
		}
		*/
		return str;
		
	}
	

	public static void main(String[] args) {
		ReverseString rv=new ReverseString();
		rv.reverse("Prashant");
		rv.reverse2ndway("India");
		
		
		}
}

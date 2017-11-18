package org.pkk.stringBuff;

public class StringBuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Prashant");
		StringBuffer str1 = new StringBuffer("Prashant");
		
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		StringBuilder str2 = new StringBuilder("Prashant");
		StringBuilder str3 = new StringBuilder("Prashant");
		
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		
		
		String str5 = new String("Prashant");
		String str6 = new String("Prashant");
		System.out.println(str5.equals(str6));
		System.out.println(str5==str6);
		
		String str7 = "Prashant";
		String str8 = "Prashant";
		System.out.println(str7.equals(str8));
		System.out.println(str7==str8);
	}

}

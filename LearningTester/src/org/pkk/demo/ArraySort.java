package org.pkk.demo;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch[]={'z','d','a','c','f','b','a'};
		int lenght=ch.length;
		int count=0;
		char temp;
		for(int j=0; j<lenght-1;j++){
		for(int i=0; i<lenght-1;i++){
			if(ch[i]>ch[i+1]){
				temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
				
			}
			if(ch[i]==ch[i+1]){
				++count;
			}
		}
		
		
		}
		System.out.println(ch );
		System.out.println(count );
	}

}

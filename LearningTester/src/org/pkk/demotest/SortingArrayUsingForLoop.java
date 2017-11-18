package org.pkk.demotest;


public class SortingArrayUsingForLoop {
	public static void main(String a[]){
		int a1[]={4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int len=a1.length;
		int temp;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-1;j++){
				if(a1[j]>a1[j+1]){					
					temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
			for(int i1=0;i1<len;i1++){
				System.out.print(a1[i1]+",");
			} 
			System.out.println("\n");
		}
		/*for(int i=0;i<len;i++){
			System.out.println("sorting :" + a1[i]);
		} */
	}

}

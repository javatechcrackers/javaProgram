package com.string.puzzles;

public class Haha {
	public static void main(String args[]) {
	//	System.out.print("H" + "a");
		//System.out.print('H' + 'a');
		int[] num = {4,4,4,3,4};
		int j = num.length;
		System.out.println(summation(num));
		StairCase(4);
		}
	
	static void StairCase(int n) {
		 for(int j=n ; j<=n ; j++){
        for(int i=1 ; i<=n ; i++){
           
            
            	 System.out.print(" ");
                 
             }
             System.out.print("#");
             System.out.print("\n");
        }

    }
	
	 static int summation(int[] numbers) {
	        int szie = numbers.length;
	        int sum = 0;
	        for(int i=0; i < szie ; i++){
	           sum = sum + numbers[i]; 
	            
	        }
	        return sum;
	    }

}

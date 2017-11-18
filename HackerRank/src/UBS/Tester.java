package UBS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



class Tester{
    public static void main(String args[] ) throws Exception {
       

    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line = br.readLine();
        int N = Integer.parseInt(line);


        while ((line = br.readLine()) != null && line.length()!= 0) { 
            String[] input = line.split(" "); 
            if (input.length == 2) { 
              
                
                display(input);
                
                
            } 
        } 
        
        
       
    }

	private static void display(String[] input) {
		int j = Integer.valueOf(input[1]);
		int f= Integer.valueOf(input[0]);
		//System.out.println(j);
		for(int k=0;k<f;k++){
		for(int i=1; i<=j;i++){
			
			if(i%3==0 ){
				
					System.out.println("Fizz "+ "\n");
				}
					
				
			else if(i%5==0 ){
				
					System.out.println("Buzz "+ "\n");
				}
					
			System.out.println(i);
			}
			
		}
			
			
			
		}
		
	}


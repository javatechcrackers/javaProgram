package Northern;

/* IMPORTANT: Multiple classes and nested static classes are supported */



import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;

class Number {
    public static void main(String args[] ) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        //Scanner
       
        int[] arr= new int[N];
        for (int i = 0; i < N; i++) {
        	 Scanner s = new Scanner(System.in);
             int n = s.nextInt();
             arr[i] = n;
        }
       
        for(int i =0 ; i<N ;i++){
        	int j = arr[i]/47;
        	 System.out.println("Hello World!" + j);
        }
       
    }
}


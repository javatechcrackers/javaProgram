package Northern;
import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


class number2 {
    public static void main(String args[] ) throws Exception {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        int[] arr = new int[N];
        for(int i=0; i<N ; i++){
            Scanner s = new Scanner(System.in);
             int n = s.nextInt();
            arr[i] = n;
        }
     
        for(int i=0 ;i<N;i++)
        { int k =0;
           for(int j=0;j<arr[i];j++){
        	  String s = Integer.toString(j) ;
        	 
        	  System.out.println("occurance of 47 in " + arr[i]+  " :: " + s.contains("47"));
           }
          
        }
    }
}


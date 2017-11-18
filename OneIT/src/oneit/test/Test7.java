package oneit.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oneit.model.Line;

/**
 *
 * @author david
 */
public class Test7
{
    public static void main (String[] args)
    {        
        // Write a process that reads the bytes input on stdin and writes each byte out UNLESS the next byte or preceeding byte are identical
        // For example (assuming the bytes are characters) 12334566676 would write out 124576.  The 3 & 6 are ommitted because the are duplicated.
        // Tests:
        // abaa = ab
        // abba = aa
        // aabbcc = <empty string>
        // abbcdde = abe
    	
    	
   	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String arg ="";
     try {
          arg = br.readLine();
     } catch (IOException ex) {
         Logger.getLogger(PrintLines.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     int len = arg.length();
    
     System.out.println(len);
     ArrayList<Character> list =   new    ArrayList<Character>(arg.length());
     ArrayList<Character> list1 =   new    ArrayList<Character>(arg.length());
     
     for(int i=0; i < len  ; i++){
    	 if(i+1 < len){
    	 if(arg.charAt(i) == (arg.charAt(i+1) )){
    		 list1.add(i,' ');  list1.add(i+1,' ');
    		 //continue;
    	 }
    	 /*else{
    		 char n = arg.charAt(i+1);
    		 list.add(n);
    	 }*/ }
     }
     System.out.println(list.toString());
     System.out.println(list1.toString());
    }
    
    

}

package oneit.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import oneit.access.*;
import oneit.model.*;

/**
 *
 * @author david
 */
public class PrintLines
{
    public static void main (String[] args)
    {
        // Summarise the lines into the minimal set of lines that can represent the points
        // e.g. 1 - 20, 15 - 25, and 40 - 50 can be represented as 1 - 25 and 40 - 50.
        // Print out the line
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arg ="";
        try {
             arg = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(PrintLines.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] arr = arg.split(",");
       
        List<Line>  lines = ReadLines.getLines(arr.length < 1 ? null : arr[1]);
       
        for(Line line : lines){
        	System.out.println("Line :: " + line.toString());
        }
        
        
    }
    
     
}

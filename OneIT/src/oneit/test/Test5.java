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
public class Test5
{
    public static void main (String[] args)
    {
        // A oneit.model.Line is an interval between two points. Each point is represented by an integer.
        // Sort the Spatial oneit.model.Line objects by the first point number (refer to PrintLines.java).  Same as:
        // ORDER BY firstPointNo
        //
        // Get the lines using ReadLines.getLines (args.length > 0 ? args[0] : "")
    	
    	
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
         	System.out.println("Line :: " + line.firstPointNo + " :: "  + line.lastPointNo);
         }
         
         Collections.sort(lines);
         
         for(Line line : lines){
          	System.out.println("Line :: " + line.firstPointNo + " :: "  + line.lastPointNo);
          }
    }
}

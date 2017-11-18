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
public class Test6
{
    public static void main (String[] args)
    {        
        // A oneit.model.Line is an interval between two points. Each point is represented by an integer.
        // Get the lines using ReadLines.getLines (args.length > 0 ? args[0] : "")
        //
        // Summarise the lines into the minimal set of lines that can represent the points.
        // Lines can be combined if their points overlap.
        // For example, the line from points 1 - 20 and the line from points 15 - 25 overlap and can be combined into 1 - 25.
        // The line 1 - 20 and 20 - 25 DO overlap, 
        // The line 1 - 20 an 21 - 25  DO NOT overlap, 
        // e.g. 1 - 20, 15 - 25, and 40 - 50 can be represented as 1 - 25 and 40 - 50.
        //
        // Print out the lines after they have been summarised.
    }
}

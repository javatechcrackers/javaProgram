/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oneit.access;

import java.util.*;
import oneit.model.*;

/**
 *
 * @author david
 */
public class ReadLines
{
    public static List<Line> getLines (String projectName)
    {
        List<Line>     result = new ArrayList<>();
        
        if (projectName.startsWith("A"))
        {
            result.add(new Line(100, 300));
            result.add(new Line(250, 350));
            result.add(new Line(500, 550));
            result.add(new Line(560, 700));
            result.add(new Line(540, 600));
        }
        else if (projectName.startsWith("B"))
        {
            result.add(new Line(100, 300));
            result.add(new Line(290, 450));
            result.add(new Line(360, 550));
            result.add(new Line(600, 700));
            result.add(new Line(740, 900));
        }
        else
        {
            result.add(new Line(0, 100));
            result.add(new Line(140, 450));
            result.add(new Line(500, 500));
        }
        
        Collections.shuffle(result);
        
        return result;
    }
}

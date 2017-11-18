/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oneit.model;

/**
 *  Lines are continuous collections of points e.g. 5, 6, 7, 8, 9.  We represent this line as 5 - 9
 */
public class Line implements Comparable<Line>
{
    public int     firstPointNo;
    public int     lastPointNo;

    public Line(int firstPointNo, int lastPointNo)
    {
        this.firstPointNo = firstPointNo;
        this.lastPointNo = lastPointNo;
    }

	@Override
	public int compareTo(Line o) {
		Line line = (Line) o ;
		if (firstPointNo == o.firstPointNo)
					return 0;
		else if (firstPointNo > o.firstPointNo)
			return 1;
		else 
			return -1;
	}
}

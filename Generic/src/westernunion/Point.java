package westernunion;
//What will be printed on the console at the end of following code execution?

public class Point{
	int x;
	int y;


public Point(int i, int j) {
		this.x=i;
		this.y=y;
		
	}

public static void main(String [] args)
{
  Point pnt1 = new Point(0,0);
  Point pnt2 = new Point(0,0);
  Point.swap(pnt1,pnt2); 
  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
}
private static void swap(Point arg1, Point arg2) {
	
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	
	
}
}

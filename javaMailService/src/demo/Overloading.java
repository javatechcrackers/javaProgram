package demo;

public class Overloading {

	private int i;
	private float j;
	
	public int sum(int i, float j){
	return (int) (i+j);
}
	public float sum(double j,int i ){
		return (float) (i+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		double d = o.sum(5,(float) 7.0);
	    System.out.println(d);
	}

}

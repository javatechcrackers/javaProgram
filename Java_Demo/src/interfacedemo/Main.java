package interfacedemo;

public class Main implements Demo1, Demo2{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d= new Main() ;
		System.out.println(Demo1.a);
	}

	@Override
	public void display() {
		//Demo2.i=5;
		
	}

}

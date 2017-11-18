package pkk.interfacedemo;

public class Main implements Demo1, Demo2{

	@Override
	public void display() {
		System.out.println("From Main");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d= new Main() ;
			d.display();
		
		
		
		System.out.println(Demo2.a);
	}

	

}

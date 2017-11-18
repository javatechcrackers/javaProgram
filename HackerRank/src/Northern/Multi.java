package Northern;

class Thread1 implements Runnable{
	Thread t;
	
	Thread1(){
		t = new Thread(this,"hello");
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println(t.getName());
		
	}
	
}
public class Multi {

	public static void main(String[] args) {
		new Thread1();

	}

}

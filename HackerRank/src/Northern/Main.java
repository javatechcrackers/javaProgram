package Northern;

import java.util.AbstractSet;
import java.util.WeakHashMap;

public class Main {
	int a;
	Main(int a){
		System.out.println(a);
	}
	void display(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		Main m = new Main(100);
		m.display();
		((Main)m).display();
	}

	
}

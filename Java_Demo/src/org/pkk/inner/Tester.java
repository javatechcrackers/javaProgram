package org.pkk.inner;

public class Tester implements OuterInterface {

	public static void main(String[] args) {
		
		Tester obj =  new Tester();
		OuterInterface.A a = new A();
		a.display();
	}

}

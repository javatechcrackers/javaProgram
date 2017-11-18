package org.pkk.poly;

public class PolyTest extends Animal  implements Inter1 {


	public static void main(String[] args) {
		PolyTest p = new PolyTest();
		p.name();
		p.type();
		Inter1 i = new PolyTest();
		i.name();
		i.type();
		Animal a = new PolyTest();
		a.name();
		a.type();
		Animal a1 = new Animal();
		a1.name();
		a1.type();
	}

	/*@Override
	public void name() {
		System.out.println("Animal impl");
		
	}

	@Override
	public void type() {
		System.out.println("Animal impl");
		
	}*/

}

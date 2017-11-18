package Paper1;

class A {
	{
		System.out.print("a1 ");
	}
	public A() { 
		System.out.print("a2 "); 
	}
}
class B extends A {
	static { 
		System.out.print("b1 "); 
	}
	public B() {
		System.out.print("b2 "); 
	}
	{ 
		System.out.print("b3 "); 
	}
	static {
		System.out.print("b4 ");
	}
}
public class C extends B {
	public static void main(String[] args) {
		System.out.print("c1 ");
		new C();
		System.out.println("c2 ");
	}
} 
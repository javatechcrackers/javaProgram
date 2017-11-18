package classloader;

//import casting.Test;

public class ClassLoad {

	public static void main(String[] args) {
		Test t = new Test();
		int i = t.hashCode();
		System.out.println(i);

		class b {
		}

		System.out.println("First attempt new b():");
		try {
			new b();
		} catch (Throwable te) {
			te.printStackTrace();
		}
		System.out.println("\nSecond attempt new b():");
		try {
			new b();
		} catch (Throwable te) {
			te.printStackTrace();
		}
	}

}

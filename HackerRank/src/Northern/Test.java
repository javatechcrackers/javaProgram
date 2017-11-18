package Northern;

public class Test {

	public static void main(String[] args) {
		call(null);
		
	}

	private static void call(Object object) {
		
		System.out.println("Obj");
	}

private static void call(Exception object) {
		
	System.out.println("Obj23");
	}
private static void call(NullPointerException object) {
	System.out.println("Obj2");
	
}
}

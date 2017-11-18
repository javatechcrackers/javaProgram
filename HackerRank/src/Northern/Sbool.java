package Northern;

public class Sbool {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		if(b1&b2 | b2 & b3 | b2)
			System.out.println("OK");
		if(b1 & b2 | b2& b3|b2|b1)
			System.out.println("yes");
		
		int a =10;
		System.out.println(a++ + ++a);
		
	}

}

package Paper1;

class CP {
	String count(int i) { return "only one"; }
	String count(short... cnt) { return "too many"; }
}
public class Test1 {
	public static void main(String [] args) {
		System.out.println(new CP().count(5));
	}
}
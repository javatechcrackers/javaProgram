package Paper1;
//When the control reaches to "TO DO" statement, how many objects will be eligible for garbage collection?
//ans = c. 2
class GCTest {
	Integer num = 50;
	GCTest go(GCTest cb) {
		cb = null;
		return cb;
	}
	public static void main(String[] args) {
		GCTest g1 = new GCTest();
		GCTest g2 = new GCTest();
		GCTest g3 = g1.go(g2);
		g1 = null;
		// TO DO
	}
}
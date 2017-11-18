package Paper1;

class CPPP {
	int x = 5;
	public static void main(String[] args) {
		final CPPP c1 = new CPPP();
		CPPP c2 = new CPPP();
		CPPP c3 = run(c1,c2);
		System.out.println((c1 == c3) + " " + (c1.x == c3.x));
	}
	static CPPP run(CPPP c1, CPPP c2) {
		CPPP CPPP = c1;
		CPPP.x = 6;
		return CPPP;
	}
}
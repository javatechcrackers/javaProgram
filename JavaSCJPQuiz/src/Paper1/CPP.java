package Paper1;

public class CPP {
	CPP c1;
	CPP() { }
	CPP(CPP c) {
		c1 = c;
	}
	public static void main(String[] args) {
		CPP c2 = new CPP();
		CPP c3 = new CPP(c2); 
		c3.go();
		CPP c4 = c3.c1; 
		c4.go();
		CPP c5 = c2.c1; 
		c5.go();
	}
	void go() { System.out.print("A "); }
} 
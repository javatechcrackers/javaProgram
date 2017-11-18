package Paper1;

public class CpTest1 {
	 static int num = 8;
	 public static void main(String[] args) {
		 new CpTest1().go(num);
		 System.out.print(" "+num);
	 }
	 void go(int num) {
		 num++;
		 for(int num = 3; num < 6; num++);
		 System.out.print(" "+num);
	 }
}
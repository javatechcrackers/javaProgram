package day2;

public class Test {

	public static void main(String[] args) {
		String[] temp  = {"j","a"};
		try{
			int c = 4/0;
		}catch(Exception e){
			System.out.println("Exceptiom");
		}finally{
			System.out.println("Exceptiom");
		}

	}

}

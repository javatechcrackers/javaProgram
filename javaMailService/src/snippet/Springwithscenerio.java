package snippet;

public class Springwithscenerio {

	
	public static void main(String[] args) {
		String s1= "prashant";
		String s2= new String("prashant");
		String s3="katiyar";
		String s4= "prashant";
		s1.concat(s3);
		System.out.println(s1.intern() == s3.intern());
		System.out.println(s2.intern() == s3.intern());
		System.out.println(s1.intern() == s4.intern());
		
		System.out.println(s1);
		
	}

}

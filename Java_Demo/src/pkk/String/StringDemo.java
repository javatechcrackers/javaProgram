package pkk.String;

public class StringDemo {

	
	
	public static void main(String[] f){
		String s="sandip";
		String s1="pkk";
		//String[] ch;
		 String s2=new String("pkk");
		 String s4=new String("pkk");
		System.out.println(s==s1);
		System.out.println(s2==s4);
		System.out.println(s==s4);
		System.out.println(s.charAt(1));
		System.out.println(s.concat(s4));
		System.out.println(s.contains(s1));
		char[] ch1=new char[s.length()];
		for(int i=s.length()-1; i>=0 ; i--){
			 ch1[s.length()-i-1] =  s.charAt(i);
			
		}
		System.out.print(ch1);
	//	s.copyValueOf(s4);
		
		
	}
}

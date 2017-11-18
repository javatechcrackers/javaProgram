package pkk.String;

public class String1 {

	public static void main(String[] args) {
		boolean a=true;
		String s="prashant";
		String s1=new String("prashant");
		if(s==s1){
			System.out.println(a);
		}
		else if(s.equals(s1)){
			System.out.println("String Match");
		}
		else{
			System.out.println(!a);
		}
	}

}

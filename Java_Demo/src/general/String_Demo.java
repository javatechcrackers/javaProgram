package general;

public class String_Demo {

//remove vowel from string and get count of those
	public static void main(String[] args) {
		
		String s="This is my country, and I love my India";
		char[] ch = new char[s.length()];
		int i1 = s.length();
		
		System.out.println(i1);
		int a=0,e=0,i=0,o=0,u=0;
		for(int j=0; j<i1; j++){
			ch[j] = s.charAt(j);
		}
		System.out.println(ch);
	/*	for(int j=0; j<i1; j++){
			if(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' ||ch[j] == 'o' ||ch[j] == 'u'){
			 ch[j] = ' ';
			}else continue;
		}*/
		//System.out.println(ch);
		for(int j=0; j<i1; j++){
		switch(ch[j]){
		case 'a':
			a++;
			ch[j] = ' ';
		
		case 'e':
			e++;
			ch[j] = ' ';
		
		case 'i':
		i++;
		ch[j] = ' ';
		
		case 'o':
			o++;
			ch[j] = ' ';
		
		case 'u':
			u++;
			ch[j] = ' ';
		
		default:
			continue;
	}

}
		System.out.println("a " +a);
		System.out.println("e " +e);
		System.out.println("i " +i);
		System.out.println("o " +o);
		System.out.println("u " +u);
		System.out.println(ch.toString().trim());
	}
}
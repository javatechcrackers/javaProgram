package general;

public class StringSort {
public static void main(String[] args) {
		
	String s="India";
	char[] ch = new char[s.length()];
	int i1 = s.length();
	//System.out.println(i1);
	//System.out.println(s.hashCode());
	for(int j=0; j<i1; j++){
		ch[j] = s.charAt(j);
	}
//	System.out.println(ch);
	
	for(int i=0; i<i1; i++){
		for(int j=0; j<i1; j++){
			if(ch[j] < ch[i]){
				ch[j]=ch[i];
				ch[i]=ch[j];
				}
				
			}
		}
	System.out.println(ch);
	
		
}
}

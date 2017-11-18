package test;

public class Duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = { 'a','e','i','b','e','a'};
	//	Character ch1 = (Character) new Character(ch1) ;
		int length = ch.length;
		int count = 0;
		System.out.println(length);
		
		for(int i = 0 ;i < length ; i++){
			for(int j=length-1; j >= 0 ;j--)
			{
				if(ch[i]==ch[j]){
		//			ch1[i] = ch[i];
					count++;
					//System.out.println(ch[j] + "Count " + count);
					
				}
				//ch1[j] = ch[j];
				//count++;
			}//System.out.println(ch1 + "Count " + count );
			//System.out.println(ch[i] + "\n");
		}
		
	}

}

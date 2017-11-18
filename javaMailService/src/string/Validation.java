package string;

import java.util.StringTokenizer;

public class Validation {
	public static final String REGEX_ALPHANUMERIC = "[A-Za-z0-9- ]*";
	
	public static void main(String[] args) {
		 Validation val = new Validation();
	     String train_id="674-140 EA 23";
	     //if(train_id.)

	  //   System.out.println(str1.toString());
	     
	if (train_id.matches(REGEX_ALPHANUMERIC) && val.check(train_id)) {
	System.out.println("Enter string is correct");
	}
	else {
	System.out.println("Enter string is not correct Please modify");
	}
	
	
	}
	public boolean check(String train_id){
		int num = train_id.lastIndexOf(" ");
		System.out.println(num);
		if((num+3) == train_id.length() || (num+2) == train_id.length()){
			System.out.println("correct");
			return true;
		}else
			System.out.println("in correct");
		return false;
	}
		
		
	}
	
	

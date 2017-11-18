package org.pkk.string;

public class ValidationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String train_id="674-140 EA 11";
		int rightmostSpace = 0;
		for(int i = 0 ;i < train_id.length();i++)
		{
		if(train_id.charAt(i)== ' ')
		{
		rightmostSpace = rightmostSpace+1;
		}
		else continue;
		}

		if (rightmostSpace == 2 )
		{ 
		System.out.println("Correct");
		}
		else{ 
			System.out.println("not Correct");
		
		}
	}
}

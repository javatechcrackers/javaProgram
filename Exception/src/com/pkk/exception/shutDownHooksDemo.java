package com.pkk.exception;

public class shutDownHooksDemo {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			try {
				if(i==4) {
					System.out.println("Inside Try Block.Exiting without executing Finally block.");
					System.exit(0);
				}
			}
			finally {
				System.out.println("Inside Finally Block.");
			}
		}
	}

}

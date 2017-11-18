package com.jbt.InterfaceandFinal;

import java.io.Serializable;

public class Employee extends superEmployee implements variableConstant{
	public String firstName;
	private static final long serialVersionUID = 5462223600l;
}
 
class superEmployee implements Serializable {
	public String lastName;
	/*
	 * Here i am providing the value of company name,companyCEO and address
	 * while defining these variables.
	 * I am making address as final here
	 */
	static String companyName = "TATA";
	transient final String address = "DEL";
	static transient String companyCEO = "Jayshree";
}
 
interface variableConstant  {
	public static final String education = "MCA";
 
}
 
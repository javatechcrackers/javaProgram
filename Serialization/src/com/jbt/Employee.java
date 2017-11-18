package com.jbt;
 
import java.io.Serializable;
 
public class Employee extends SuperEmployee {
	public String firstName;
	private static final long serialVersionUID = 5462223600l;
}
 
class SuperEmployee implements Serializable{
	public String lastName;
	//static  String companyName;
//	transient  String address;
	//static transient String companyCEO;
	
	/*
	 * Here i am providing the value of company name,companyCEO and address
	 * while defining these variables.
	 */	
		static String companyName = "TATA";
		transient final String address = "DEL";
		static transient String companyCEO = "Jayshree";


}
package com.pkk.instance;

//import sun.print.resources.serviceui;

public class ClassInstatiation {
	
	Report report;
	
	
	public Report getReport() {
		return report;
	}


	public void setReport(Report report) {
		this.report = report;
	}

	

	public static void main(String[] args) {
		ClassInstatiation c = new ClassInstatiation();
		Report re = new Report(1234, "accountsummery");
		c.setReport(re);
		
		System.out.println(c.getReport().getInstanceId());
		
		try {
			Class s = Class.forName("com.pkk.instance.ClassInstatiation");
			System.out.println(s.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

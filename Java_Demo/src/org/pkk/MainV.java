package org.pkk;

public class MainV {

	Employee emp;
	
	
	
	public Employee getEmp() {
		return emp;
	}



	public void setEmp(Employee emp) {
		this.emp = new Employee();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		MainV v = new MainV();
		 v.setEmp(e);
		v.getEmp().setId(1);
		v.getEmp().setName("pkk");
		
		System.out.println("ID ::" + v.getEmp().getId() +  " Name :: " + v.getEmp().getName() );
		
		
		
	}

}

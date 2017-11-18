package ArrayList;

public class Employee implements Comparable<Employee>{
	int empid;
	String name;
	boolean male=true;
	long salary;
	public int deptid;
	
	
	


	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public Employee(){
		empid=101;
		name="prashant";
		male=true;
		salary=20000;
		deptid = 1020;
	}
	
	public Employee(int empid, String name, boolean male, long salary,
			int deptid) {
		super();
		this.empid = empid;
		this.name = name;
		this.male = male;
		this.salary = salary;
		this.deptid = deptid;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return empid+" "+name+" "+male+" " + salary+" "+ deptid;
	}

	public int compareTo(Employee name) {
		if (this.getSalary() > name.getSalary())
			return 1;
		else if (this.getSalary() < name.getSalary())
			return -1;
		else
			return 0;

	}
}

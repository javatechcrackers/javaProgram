package ArrayList;

public class Dept extends Employee{
	public Dept(int deptid, String dept) {
		super();
		this.deptid = deptid;
		this.dept = dept;
	}
	public int deptid;
	String dept;
	
	public Dept(){
		deptid=1005;
		dept="Commerce";
	}
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString(){
		return deptid+" "+dept;
	}
}

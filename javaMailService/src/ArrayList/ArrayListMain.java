package ArrayList;


//import com.ArrayList.*;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(102,"Ravi",true,250000,1020);
		Employee emp1 = new Employee(103,"Prashant",true,2000,1120);
		/*emp.setEmpid(102);
		emp.setName("Ravi");
		emp.setMale(true);
		emp.setSalary(250000);
		emp.setDeptid(1020);
		emp1.setEmpid(103);
		emp1.setName("PKK");
		emp1.setMale(true);
		emp1.setSalary(2000);
		emp1.setDeptid(1120);*/
		Dept dept = new Dept(1020,"IT");
		/*dept.setDept("IT");
		dept.setDeptid(1020);*/

		ArrayList<Employee> list = new ArrayList<Employee>();
		ArrayList<Dept> list1 = new ArrayList<Dept>();
		ArrayList<Employee> list9 = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list1.add(dept);
		list9.add(dept);
		System.out.println(list9);
		System.out.println(list);
		System.out.println(dept);
		System.out.println(list + " " + list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (Employee e : list) {
			for (Dept d : list1) {
				if (e.deptid == d.deptid) {

					list2.add(e.deptid);
				}
			}
		}
		System.out.println(list2);
		
		// Comparator interface compare EmpComparator
		
		//Collections.sort(list, new EmpComparator());
		for (Employee a : list) {
			System.out.println(a.getEmpid()  + "  " + a.getName());
		}
		
		// Comparable interface *Employee* compareTo
		//Collections.sort(emp.compareTo(emp1));
		
		if (emp.compareTo(emp1) > 0) {
			System.out.println(emp.getSalary() + " is better.");
		} else {
			System.out.println(emp1.getSalary() + " is better.");
		}

	}

	boolean istrue;
	
	
	
	
	
}

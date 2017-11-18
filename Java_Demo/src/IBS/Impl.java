package IBS;

import java.util.ArrayList;

public class Impl {

	
	
	
	public static void main(String[] args) {
		ArrayList<Employee> list= new ArrayList();
		list.add(new Employee(1,"Prashnat",4));
		list.add(new Employee(2,"ajit",6));
		list.add(new Employee(3,"sam",3));
		list.add(new Employee(4,"Prashnat",7));
		
		Impl e = new Impl();
		System.out.println("Before removing " + list.toString());
		for(Employee e1:list){
			System.out.println("id " + e1.getId() + "name" + e1.getName() + "exp" + e1.getExp());
		}
		e.removeelement(list);
		
		
	}

	private void removeelement(ArrayList<Employee> list) {
		// TODO Auto-generated method stub
		ArrayList list2 =new ArrayList<>();
		for(Employee e:list){
			if(e.getExp()>5){
				list2.add(e);
				/*list.remove(e);*/
			}
			else 
				continue;
	
			}
		list.removeAll(list2);
		System.out.println("list2 = " + list2);
		System.out.println("After removing " + list);
		}
	}



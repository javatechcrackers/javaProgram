package pkk.IBS;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Impl {

	
	
	
	public static void main(String[] args) {
		ArrayList<Employee> list= new ArrayList();
		list.add(new Employee(1,"Prashnat",4));
		list.add(new Employee(2,"ajit",6));
		list.add(new Employee(3,"sam",3));
		list.add(new Employee(4,"Prashnat",7));
		
		Impl e = new Impl();
	/*	System.out.println("Before removing " + list.toString());
		for(Employee e1:list){
			System.out.println("id " + e1.getId() + "name" + e1.getName() + "exp" + e1.getExp());
		}*/
		/**
		 * here while iterating list, I am trying to remove element from it.
		 * but its throwing java.util.ConcurrentModificationException 
		 * to avoid this either we have to add all the element in new list and then 
		 * remove all or we can implement concurrent hashset
		 */
		
	//	e.concurrentError(list);
		//e.removeelement(list);
		e.concurrentModification(list);
		
		
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
	
	public void concurrentError(ArrayList<Employee> list){
		System.out.println("List B4 :: " + list.toString());
		for(Employee e : list){
			if(e.getExp()>5){
				list.remove(e);
			}
		}
		System.out.println("List :: " + list.toString());
	}
	
	public void concurrentModification(ArrayList<Employee> list){
		//int a=1;
		System.out.println("List B4 :: " + list.toString());
		Map<Integer,Employee> map = new ConcurrentHashMap<Integer,Employee>();
		//inserting data into map
		for(int a=0; a<list.size();a++){
		for(Employee e : list){
			map.put(a, list.get(a));
			
		}
		}
		System.out.println("Map B4 :: "+ map.size() +" :: "+ map.toString());
		
		//now trying go delete element while iterating
		
		for(Map.Entry<Integer, Employee> e : map.entrySet()){
			if(e.getValue().getExp() > 5){
				//map.remove(e.getKey(), e);
				map.put(7, new Employee(1,"Prashnat",4));
			}
			
		}
		System.out.println("Map After :: "+ map.size() +" :: "+ map.toString());
		
		}
	//	System.out.println("List :: " + list.toString());
	

}
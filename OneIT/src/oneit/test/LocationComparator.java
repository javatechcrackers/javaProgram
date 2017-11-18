package oneit.test;

import java.util.Comparator;

import oneit.model.Warehouse;

class LocationComparator implements Comparator{  
	
	public int compare(Object o1,Object o2){  
	Warehouse s1=(Warehouse)o1;  
	Warehouse s2=(Warehouse)o2;  
  
	return s1.warehouseCode.compareTo(s2.warehouseCode);  
}


}
package oneit.test;

import java.util.Comparator;

import oneit.model.Product;

public class ProductComparator  implements Comparator{

	public int compare(Object o1,Object o2){  
		Product s1=(Product)o1;  
		Product s2=(Product)o2;  
	  
	if(s1.productCode==s2.productCode)  
	return 0;  
	else if(s1.costPrice>s2.costPrice)  
	return 1;  
	else  
	return -1;  
	}
	
}

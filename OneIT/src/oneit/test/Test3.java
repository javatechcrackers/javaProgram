package oneit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import oneit.access.*;
import oneit.model.*;

/**
 *
 * @author david
 */
public class Test3
{
    public static void main (String[] args)
    {
        // Sort the inventory records by location as the primary sort and then product as the second sort and print them out
        // In SQL, this is equivalent to:
        // ORDER BY productCode, warehouseCode
        //
        // Use ReadInventory.getInventory() to get the inventory.  The system must be able to cope with new products / locations.
    	
    	List<Inventory> list = ReadInventory.getInventory();
    	List<Warehouse> listware = new ArrayList<>();
    	List<Product> listprod = new ArrayList<>();
    	for(Inventory ivn : list){
    		listware.add(ivn.getLocation());
    	}
    	for(Inventory ivn : list){
    		listprod.add(ivn.productInStock);
    	}
    	
    	Collections.sort(listware,new LocationComparator());  
    	Collections.sort(listprod,new ProductComparator
    			());  
    	for(Inventory ivn : list){
    		
    		System.out.println("Location :: " + ivn.location + " Product  :: " + ivn.productInStock.costPrice );
    	
    		System.out.println();
    	}  
    	
    }
}

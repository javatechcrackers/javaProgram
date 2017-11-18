package oneit.test;

import java.util.List;

import oneit.access.*;
import oneit.model.*;

/**
 *
 * @author david
 */
public class Test1
{
    public static void main (String[] args)
    {
        // Print it out the total value of all inventory combined 
        // Use ReadInventory.getInventory() to get the inventory
    	List<Inventory> list = ReadInventory.getInventory();
    	float value = 0;
    	
    	
    	for(Inventory ivn : list){
    		value = value + (float) (ivn.quantityInStock * ivn.productInStock.costPrice ); 
    	}
    	System.out.println("Total value combined"
    			+ "Value :: " + value);
    	
    }
}

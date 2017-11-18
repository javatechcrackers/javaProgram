package oneit.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oneit.access.*;
import oneit.model.*;

/**
 *
 * @author david
 */
public class Test2 {

    public static void main(String[] args) 
    {
        // Print out the quantity in stock and total value of that stock grouped by product (across all locations) e.g.
        // Knife        20     300
        // Cup          10     100
        // Use ReadInventory.getInventory() to get the inventory.  The system must be able to cope with new products.
    	List<Inventory> list = ReadInventory.getInventory();
    	int cupquantity = 0,cupvalue = 0;
    	int knfquantity = 0,knfvalue = 0;
    	int plquantity = 0,plvalue = 0;
    	
    	for(Inventory ivn : list){
    		
    	if(	ivn.productInStock.productCode.equals("CUP")){
    		cupquantity = cupquantity + ivn.quantityInStock; 
    		cupvalue = (int) (cupvalue + (ivn.quantityInStock*ivn.productInStock.costPrice));
    	}
    	else if(ivn.productInStock.productCode.equals("KNF"))
    	{
    		knfquantity = knfquantity + ivn.quantityInStock; 
    		knfvalue = (int) (knfvalue + (ivn.quantityInStock*ivn.productInStock.costPrice));
    	}
    	else
    	{
    		plquantity = plquantity + ivn.quantityInStock; 
    		plvalue = (int) (plvalue + (ivn.quantityInStock*ivn.productInStock.costPrice));
    	}
    	
    	
    }
    	System.out.println("===============================================");
    	System.out.println("CUP :: " + cupquantity + " CUP VALUE :: " + cupvalue);
    	System.out.println("Knife :: " + knfquantity + " knife VALUE :: " + knfvalue);
    	System.out.println("Plate :: " + plquantity + " Plate VALUE :: " + plvalue);
    }

}
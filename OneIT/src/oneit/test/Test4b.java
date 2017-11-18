package oneit.test;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import oneit.access.*;
import oneit.model.*;

/**
 *
 * @author david
 */
public class Test4b
{
    public static void main (String[] args)
    {
        // Print out the records, grouped by location, with totals and sub totals e.g.
        // Perth
        //      Knife        20     $300
        //      Cup          10     $100
        //      Plate     1,000   $1,000
        // -----------------------------
        //                1,430   $1,400
        // -----------------------------
        //
        // Melbourne
        //    etc.
        // Formatting is important.  It is important that the right of the numbers align and that numbers are represented with , and $ where appropriate
        
    	List<Inventory> list = ReadInventory.getInventory();
		int cupquantity = 0, cupvalue = 0;
		int knfquantity = 0, knfvalue = 0;
		int plquantity = 0, plvalue = 0;
		Warehouse locationtmp = null;
		int totalvalue;
		int totalquantity;
		Set<Warehouse> location = new HashSet<Warehouse>();
		for (Inventory ivn : list) {
			location.add(ivn.location);
		}
		for (Warehouse loca : location) {
			
		for (Inventory ivn : list) {

			if(ivn.location.equals(loca)){
				locationtmp = loca;
				if (ivn.productInStock.productCode.equals("CUP")) {
					cupquantity = cupquantity + ivn.quantityInStock;
					cupvalue = (int) (cupvalue + (ivn.quantityInStock * ivn.productInStock.costPrice));
				} else if (ivn.productInStock.productCode.equals("KNF")) {
					knfquantity = knfquantity + ivn.quantityInStock;
					knfvalue = (int) (knfvalue + (ivn.quantityInStock * ivn.productInStock.costPrice));
				} else {
					plquantity = plquantity + ivn.quantityInStock;
					plvalue = (int) (plvalue + (ivn.quantityInStock * ivn.productInStock.costPrice));
				}
			}
		}
		System.out.println( locationtmp);
		
		System.out.println("CUP  \t" + cupquantity + "\t  \t$" + cupvalue);
		System.out.println("Knife  \t" + knfquantity + "\t  \t$" + knfvalue);
		System.out.println("Plate  \t" + plquantity + "\t \t$" + plvalue);
		 totalquantity = cupquantity + knfquantity + plquantity;
		 totalvalue = (cupquantity*cupvalue + knfquantity*knfvalue + plquantity*plvalue);
		System.out.println("------------------------------------------------------------");
		System.out.println("\t" +totalquantity + "\t   \t $" + totalvalue);
		System.out.println("------------------------------------------------------------");
		}
		

	}
    	
    
}

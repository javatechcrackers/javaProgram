package oneit.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import oneit.access.ReadInventory;
import oneit.model.*;

/**
 *
 * @author david
 */
public class Test4 {
	public static void main(String[] args) {
		// Print out the records, grouped by location, with totals and sub
		// totals e.g.
		// Perth
		// Knife 20 300
		// Cup 10 100
		// 30 400
		// Melbourne
		// etc.
		// No formatting is required.
		//
		// Use ReadInventory.getInventory() to get the inventory. The system
		// must be able to cope with new products / locations.

		List<Inventory> list = ReadInventory.getInventory();
		int cupquantity = 0, cupvalue = 0;
		int knfquantity = 0, knfvalue = 0;
		int plquantity = 0, plvalue = 0;
		Warehouse locationtmp = null;
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
		System.out.println("Location :: " + locationtmp);
		System.out.println("CUP :: " + cupquantity + " CUP VALUE :: " + cupvalue);
		System.out.println("Knife :: " + knfquantity + " knife VALUE :: " + knfvalue);
		System.out.println("Plate :: " + plquantity + " Plate VALUE :: " + plvalue);
		}
		

	}

}

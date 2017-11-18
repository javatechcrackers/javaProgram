package oneit.test;

import oneit.access.*;
import oneit.model.*;

/**
 *
 * @author david
 */
public class PrintInventory
{
    public static void main (String[] args)
    {
        for (Inventory invRecord : ReadInventory.getInventory())
        {
            Product product = invRecord.productInStock;
            
            System.out.println ("Location:" + invRecord.rack + "@" + invRecord.location.warehouseCode + "\tProduct:" + product.productCode + "\tQty:" + invRecord.quantityInStock + "\tCost:" + invRecord.quantityInStock * product.costPrice);
        }
    }
}

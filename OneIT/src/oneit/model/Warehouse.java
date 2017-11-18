/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oneit.model;

/**
 *
 * @author david
 */
public class Warehouse 
{
    public String warehouseCode;

    public Warehouse(String warehouseCode)
    {
        this.warehouseCode = warehouseCode;
    }

    @Override
    public String toString()
    {
        return warehouseCode;
    }


    
    
}

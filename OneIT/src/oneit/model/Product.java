/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oneit.model;

/**
 *
 * @author david
 */
public class Product
{
    public String   productCode;
    public String   description;
    public double   costPrice;

    public Product(String productCode, String description, double costPrice)
    {
        this.productCode = productCode;
        this.description = description;
        this.costPrice = costPrice;
    }

    @Override
    public String toString()
    {
        return productCode;
    }
    
    
}

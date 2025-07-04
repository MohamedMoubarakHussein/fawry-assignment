package entity.implementation.product;

import java.util.Date;

import entity.contract.product.ExpirationProductInterface;

public class ExpirationShippableProduct extends ShippableProduct implements ExpirationProductInterface {
    private Date expirationDate;
    public ExpirationShippableProduct(String name , Double price , Integer quantity){
        super(name, price, quantity);
    }
    
    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
}

package entity.implementation;

import java.util.Date;

import entity.contract.ExpirationProduct;

public class ExpirationalShippableProductImpl extends ShippableProductImpl implements ExpirationProduct {
    private Date expirationDate;
    public ExpirationalShippableProductImpl(String name , Double price , Integer quantity){
        super(name, price, quantity);
    }
    
    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
}

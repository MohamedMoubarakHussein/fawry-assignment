package entity.implementation;

import java.util.Date;

import entity.contract.ExpirationProduct;

public class ProductHasExpirationImpl extends ProductImpl implements ExpirationProduct {
    private Date expirationDate;

    public ProductHasExpirationImpl(String name , Double price , Integer quantity){
        super(name, price, quantity);
    }
    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
}

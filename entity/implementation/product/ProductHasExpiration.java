package entity.implementation.product;

import java.util.Date;

import entity.contract.product.ExpirationProductInterface;

public class ProductHasExpiration extends Product implements ExpirationProductInterface {
    private Date expirationDate;

    public ProductHasExpiration(String name , Double price , Integer quantity){
        super(name, price, quantity);
    }
    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
}

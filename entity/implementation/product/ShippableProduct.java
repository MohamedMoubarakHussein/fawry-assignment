package entity.implementation.product;

import entity.contract.product.ShippableProductInterface;

public class ShippableProduct  extends Product implements ShippableProductInterface{

    private Double weight;
    
    public ShippableProduct(String name , Double price , Integer quantity){
        super(name, price, quantity);
    }
    @Override
    public Double getWeight() {
       return this.weight;
    }
    
}

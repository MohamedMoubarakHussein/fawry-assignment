package entity.implementation;

import entity.contract.ShippableProduct;

public class ShippableProductImpl  extends ProductImpl implements ShippableProduct{

    private Double weight;
    
    public ShippableProductImpl(String name , Double price , Integer quantity){
        super(name, price, quantity);
    }
    @Override
    public Double getWeight() {
       return this.weight;
    }
    
}

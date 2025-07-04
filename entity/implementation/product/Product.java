package entity.implementation.product;

import entity.contract.product.ProductInterface;

public class Product implements  ProductInterface{

    private String productName;
    private Double price;
    private Integer quantity;


    public Product(String name , Double price , Integer quantity){
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String getName() {
        return this.productName;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public Integer getQuantity() {
        return this.quantity;
    }
    
}

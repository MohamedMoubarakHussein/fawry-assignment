package entity.contract.cart;

import java.util.Map;

import entity.implementation.product.Product;

public interface CartInterface {
    
    void add(Product product, Integer quantity);
    Map<Product , Integer> getAllProducts();
    Map<Product , Integer> getShippableProducts();

}

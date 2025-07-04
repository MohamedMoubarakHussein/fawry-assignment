package entity.contract.cart;

import entity.contract.product.ProductInterface;

public interface CartInterface {
    
    void add(ProductInterface product, Integer quantity);
}

package entity.implementation.cart;

import java.util.HashMap;
import java.util.Map;

import entity.contract.cart.CartInterface;
import entity.contract.product.ProductInterface;

public class CartImpl implements CartInterface {

    private Map<ProductInterface , Integer> products;

    public CartImpl(){
        this.products = new HashMap<>();
    }
    @Override
    public void add(ProductInterface product, Integer quantity) {
        if(products.containsKey(product)){
            products.put(product, products.get(product)+quantity);
        }else{
            products.put(product, quantity);
        }
    }
    
}

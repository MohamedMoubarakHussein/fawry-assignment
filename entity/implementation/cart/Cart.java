package entity.implementation.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import entity.contract.cart.CartInterface;
import entity.contract.product.ShippableProductInterface;
import entity.implementation.product.Product;
import entity.implementation.product.ShippableProduct;

public class Cart implements CartInterface {

    private Map<Product , Integer> products;

    public Cart(){
        this.products = new HashMap<>();
    }
    @Override
    public void add(Product product, Integer quantity) {
        if(products.containsKey(product)){
            Integer curQuantity =  products.get(product);
            curQuantity += quantity;
            products.put(product, curQuantity);
        }else{
            
            products.put(product,quantity);
        }
    }

    public Map<Product , Integer> getAllProducts(){
        
        return this.products;
    }


      public Map<Product , Integer> getShippableProducts(){
        Map<Product , Integer> ans = new HashMap<>();
        for (Entry<Product, Integer> elem : this.products.entrySet()) {
            if(elem instanceof ShippableProduct)
                ans.put(elem.getKey(), elem.getValue());
        }
        return ans;
    }
    
}

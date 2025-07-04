package entity.entityFactory;

import java.util.Date;

import entity.implementation.product.ExpirationShippableProduct;
import entity.implementation.product.ProductHasExpiration;
import entity.implementation.product.Product;
import entity.implementation.product.ShippableProduct;

public class ProductFactory {
    

    public static Product createProduct(String name , Double price , Integer quantity,boolean shippable, Double weight , boolean hasExpirationDate , Date expirationDate){
        if(shippable && hasExpirationDate)
            return new  ExpirationShippableProduct(name , price , quantity);
        else if(shippable)
            return new ShippableProduct(name , price , quantity);
        else if(hasExpirationDate)
            return new ProductHasExpiration(name , price , quantity);
        else 
            return new Product(name , price  , quantity);
    }
}

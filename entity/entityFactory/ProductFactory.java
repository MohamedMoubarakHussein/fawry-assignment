package entity.entityFactory;

import java.util.Date;

import entity.implementation.product.ExpirationalShippableProductImpl;
import entity.implementation.product.ProductHasExpirationImpl;
import entity.implementation.product.ProductImpl;
import entity.implementation.product.ShippableProductImpl;

public class ProductFactory {
    

    public static ProductImpl createProduct(String name , Double price , Integer quantity,boolean shippable, Double weight , boolean hasExpirationDate , Date expirationDate){
        if(shippable && hasExpirationDate)
            return new  ExpirationalShippableProductImpl(name , price , quantity);
        else if(shippable)
            return new ShippableProductImpl(name , price , quantity);
        else if(hasExpirationDate)
            return new ProductHasExpirationImpl(name , price , quantity);
        else 
            return new ProductImpl(name , price  , quantity);
    }
}

package entity.entityFactory;

import java.util.Date;

import entity.implementation.ExpirationalShippableProductImpl;
import entity.implementation.ProductHasExpirationImpl;
import entity.implementation.ProductImpl;
import entity.implementation.ShippableProductImpl;

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

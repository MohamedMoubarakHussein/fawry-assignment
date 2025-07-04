package service.implementation;

import java.util.List;

import entity.contract.cart.CartInterface;
import entity.contract.product.ShippableProductInterface;

public class ShippingService {
    
    public ShippingService(CartInterface cart){
        
    }
    public String shipment(List<ShippableProductInterface> products){

        return "Done";
    }
}

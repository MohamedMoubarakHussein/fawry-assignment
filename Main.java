import java.util.Date;

import entity.entityFactory.ProductFactory;
import entity.implementation.cart.Cart;
import entity.implementation.customer.Customer;
import entity.implementation.product.ExpirationShippableProduct;
import entity.implementation.product.ShippableProduct;
import service.implementation.CheckoutService;

public class Main {
    
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mohamed", 500.0);
        Cart cart = new Cart();
        ShippableProduct tv = (ShippableProduct) ProductFactory.createProduct("tv", 200.0, 2, true, 2000.0, false, null);
        ExpirationShippableProduct cheese = (ExpirationShippableProduct) ProductFactory.createProduct("cheese", 200.0, 2, true, 500.0, true, new Date());
        cart.add(tv, 1);
        cart.add(cheese, 1);
        new CheckoutService(customer1, cart);
    
    }
}

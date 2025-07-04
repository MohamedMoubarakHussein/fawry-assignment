package service.implementation;

import java.util.Map;

import entity.contract.cart.CartInterface;
import entity.contract.customer.CustomerInterface;
import entity.contract.product.GenericProductInterface;
import entity.contract.product.ShippableProductInterface;
import entity.implementation.cart.Cart;
import entity.implementation.customer.Customer;
import entity.implementation.product.ExpirationShippableProduct;
import entity.implementation.product.Product;
import entity.implementation.product.ShippableProduct;


public class CheckoutService {
    private Map<Product,Integer> shippableProduct;
    private Map<Product,Integer>  allProduct ;
    private Double UNIFIED_SHIPPING_COST = 2.0;
    private Double subTotal = 0.0;
    private Double totalAmount = 0.0;
    private Integer numberOfItems = 0;
    public CheckoutService(Customer customer , Cart cart){
        
       this.shippableProduct = cart.getShippableProducts();
       this.allProduct = cart.getAllProducts();
       subTotal = subTotalCost(); 
       numberOfItems =  numberOfItems();
       Boolean availability = stockCheck();

       if(!availability){
            System.out.println("one product is out of stock or expired.");
            return;
       }
       if(totalAmount > customer.getBlance()){
            System.out.println("account balance is insufficient");
            return;
        }
        customer.setBalance(customer.getBlance()-customer.getBlance());
        if(numberOfItems == 0 ){
            System.out.println("Cart is empty");
            return;
        }
        printShippmentNotes();
        printReceipt();


        System.out.println("-----------------");
        System.out.println("Subtotal     "+subTotal);
        System.out.println("Shipping     "+UNIFIED_SHIPPING_COST);
        System.out.println("Amount     "+ (UNIFIED_SHIPPING_COST+subTotal));

        

    }

    public void printShippmentNotes(){
         if(shippableProduct.isEmpty()){
            return;
         }
        System.out.println("** Shipment notice **");
        for(Map.Entry<Product,Integer> i : shippableProduct.entrySet()){
           if(i instanceof ShippableProduct || i instanceof ExpirationShippableProduct)
           System.out.println(i.getValue()+"x "+i.getKey().getName()+"    "+i.getValue()*((ShippableProduct) i.getKey()).getWeight()+" g");
        }
    }
    public void printReceipt(){
        System.out.println("** Checkout receipt **");
        for(Map.Entry<Product, Integer> i : allProduct.entrySet()){
            System.out.println(i.getValue()+"x "+i.getKey().getName()+"    "+i.getValue()*i.getKey().getPrice());
            subTotal += i.getValue()*i.getKey().getPrice();
        }
    }


    public Integer numberOfItems(){
        return allProduct.size();

    }

    public Double subTotalCost(){
        Double totalCost = 0.0;
        for(Map.Entry<Product, Integer> i : allProduct.entrySet()){
            if(i.getValue() > i.getKey().getQuantity()){
                totalCost += i.getKey().getPrice()*i.getValue();
            }
        }
        return totalCost;
    }

    public boolean stockCheck(){
       
        for(Map.Entry<Product, Integer> i : allProduct.entrySet()){
            if(i.getValue() <= i.getKey().getQuantity()){
                allProduct.put(i.getKey(),i.getKey().getQuantity()- i.getValue());
            }else{
                return false; 
            }
        }
        return true;
    
    }
}

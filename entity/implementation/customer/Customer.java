package entity.implementation.customer;

import entity.contract.customer.CustomerInterface;

public class Customer implements CustomerInterface {

    private String name;
    private Double balance;


    public Customer(String name, Double balance){
        this.balance = balance;
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getBlance() {
        return this.balance;    
    }
    @Override
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
}

package entity.implementation.customer;

import entity.contract.customer.CustomerInterface;

public class CustomerImpl implements CustomerInterface {

    private String name;
    private Double balance;


    public CustomerImpl(String name, Double balance){
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
    
}

package entity.contract.product;

import java.util.Date;

public interface GenericProductInterface {
    Date getExpirationDate();
    String getName();
    Double getPrice();
    Integer getQuantity();
    Double getWeight();
}

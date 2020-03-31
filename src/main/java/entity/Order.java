package entity;

import java.util.List;

public class Order {

    private String id;
    private String userId;
    private List<ShoppingItem> orderItems;
    private Address address;
}

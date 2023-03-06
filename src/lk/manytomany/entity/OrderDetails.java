package lk.manytomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class OrderDetails {
    @Id
    private String id;
    @OneToMany
    private Order order;
    @OneToMany
    private Item item;

    private int qty;

}

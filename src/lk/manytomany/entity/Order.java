package lk.manytomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Order {
    @Id
    private String oId;

    private List<OrderDetails> orderDetailsList;
}

package lk.manytomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Item {
    @Id
    private String code;
    private List<OrderDetails> orderDetailsList;
}

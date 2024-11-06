package fooddeliveryapp.domain;

import fooddeliveryapp.CustomerManagementApplication;
import fooddeliveryapp.domain.OrderPlaced;
import fooddeliveryapp.domain.PaymentProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    private String orderId;

    private String foodType;

    @Embedded
    private int quantity;

    private String content;

    @Embedded
    private User user;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        PaymentProcessed paymentProcessed = new PaymentProcessed(this);
        paymentProcessed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = CustomerManagementApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root

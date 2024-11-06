package fooddeliveryapp.domain;

import fooddeliveryapp.domain.*;
import fooddeliveryapp.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderConfirmed extends AbstractEvent {

    private String orderId;
    private String restaurantId;

    public OrderConfirmed(Restaurant aggregate) {
        super(aggregate);
    }

    public OrderConfirmed() {
        super();
    }
}
//>>> DDD / Domain Event

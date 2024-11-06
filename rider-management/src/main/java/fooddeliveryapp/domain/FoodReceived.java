package fooddeliveryapp.domain;

import fooddeliveryapp.domain.*;
import fooddeliveryapp.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FoodReceived extends AbstractEvent {

    private String riderId;
    private String restaurantId;
    private String orderId;

    public FoodReceived(Rider aggregate) {
        super(aggregate);
    }

    public FoodReceived() {
        super();
    }
}
//>>> DDD / Domain Event

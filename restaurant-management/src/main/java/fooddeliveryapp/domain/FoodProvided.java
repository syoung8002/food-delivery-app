package fooddeliveryapp.domain;

import fooddeliveryapp.domain.*;
import fooddeliveryapp.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FoodProvided extends AbstractEvent {

    private String restaurantId;
    private String foodType;
    private String foodStatus;
    private int preparationTime;

    public FoodProvided(Restaurant aggregate) {
        super(aggregate);
    }

    public FoodProvided() {
        super();
    }
}
//>>> DDD / Domain Event

package fooddeliveryapp.domain;

import fooddeliveryapp.domain.*;
import fooddeliveryapp.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentProcessed extends AbstractEvent {

    private String orderId;
    private String paymentMethod;
    private String receipt;

    public PaymentProcessed(Order aggregate) {
        super(aggregate);
    }

    public PaymentProcessed() {
        super();
    }
}
//>>> DDD / Domain Event

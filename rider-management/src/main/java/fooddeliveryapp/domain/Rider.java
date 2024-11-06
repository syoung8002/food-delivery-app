package fooddeliveryapp.domain;

import fooddeliveryapp.RiderManagementApplication;
import fooddeliveryapp.domain.DeliveryCompleted;
import fooddeliveryapp.domain.FoodReceived;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Rider_table")
@Data
//<<< DDD / Aggregate Root
public class Rider {

    @Id
    private String riderId;

    private String deliveryStatus;

    private String currentLocation;

    @PostPersist
    public void onPostPersist() {
        FoodReceived foodReceived = new FoodReceived(this);
        foodReceived.publishAfterCommit();

        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RiderRepository repository() {
        RiderRepository riderRepository = RiderManagementApplication.applicationContext.getBean(
            RiderRepository.class
        );
        return riderRepository;
    }
}
//>>> DDD / Aggregate Root

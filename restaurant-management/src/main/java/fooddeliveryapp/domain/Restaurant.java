package fooddeliveryapp.domain;

import fooddeliveryapp.RestaurantManagementApplication;
import fooddeliveryapp.domain.FoodProvided;
import fooddeliveryapp.domain.OrderConfirmed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Restaurant_table")
@Data
//<<< DDD / Aggregate Root
public class Restaurant {

    @Id
    private String restaurantId;

    private String foodType;

    private String foodStatus;

    @Embedded
    private int preparationTime;

    @PostPersist
    public void onPostPersist() {
        OrderConfirmed orderConfirmed = new OrderConfirmed(this);
        orderConfirmed.publishAfterCommit();

        FoodProvided foodProvided = new FoodProvided(this);
        foodProvided.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RestaurantRepository repository() {
        RestaurantRepository restaurantRepository = RestaurantManagementApplication.applicationContext.getBean(
            RestaurantRepository.class
        );
        return restaurantRepository;
    }
}
//>>> DDD / Aggregate Root

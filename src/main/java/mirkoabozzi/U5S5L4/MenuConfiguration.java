package mirkoabozzi.U5S5L4;

import mirkoabozzi.U5S5L4.entities.Drink;
import mirkoabozzi.U5S5L4.entities.Pizza;
import mirkoabozzi.U5S5L4.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfiguration {

    @Bean
    public Topping getToppingPomodoro() {
        return new Topping("Pomodoro", 50, 3);
    }

    @Bean
    public Topping getToppingMozzarella() {
        return new Topping("Mozzarella", 300, 3);
    }

    @Bean
    public Topping getToppingProsciutto() {
        return new Topping("Prosciutto", 50, 2);
    }

    @Bean
    public Topping getToppingPatatine() {
        return new Topping("Patatine", 100, 3);
    }

    @Bean
    public Pizza getPizzaMargherita() {
        return new Pizza("Margherita", 500, 6, List.of(getToppingPomodoro(), getToppingMozzarella()));
    }

    @Bean
    public Pizza getPizzaProsciutto() {
        return new Pizza("Pizza Prosciutto", 550, 8.00, List.of(getToppingPomodoro(), getToppingMozzarella(), getToppingProsciutto()));
    }

    @Bean
    public Pizza getPizzaPatatine() {
        return new Pizza("Pizza Patatine", 600, 9.00, List.of(getToppingPomodoro(), getToppingMozzarella(), getToppingPatatine()));
    }

    @Bean
    public Drink getDrinkCocaCola() {
        return new Drink("Coca Cola", 20, 1.00, 0.33);
    }

    @Bean
    public Drink getBeer() {
        return new Drink("Ichnusa", 80, 1, 0.33);
    }


}

package mirkoabozzi.U5S5L4;

import mirkoabozzi.U5S5L4.entities.Drink;
import mirkoabozzi.U5S5L4.entities.Pizza;
import mirkoabozzi.U5S5L4.entities.Product;
import mirkoabozzi.U5S5L4.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfiguration {

    @Bean
    public Topping getToppingMargherita(){return new Topping("Margherita",500,6);}

    @Bean
    public Topping getToppingProsciutto() {
        return new Topping("prosciutto", 50, 2);
    }

    @Bean
    public Topping getToppingPatatine() {
        return new Topping("patatine", 100, 3);
    }

    @Bean
    public Pizza getPizzaProsciutto() {
        return new Pizza("Pizza Prosciutto", 500, 8.00,);
    }

    @Bean
    public Pizza getPizzaPatatine() {
        return new Pizza("Pizza Patatine", 600, 9.00, getToppingPatatine());
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

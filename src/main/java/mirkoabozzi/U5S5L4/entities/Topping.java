package mirkoabozzi.U5S5L4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@DiscriminatorValue("topping")
public class Topping extends Product {
    @ManyToMany
    @JoinTable(name = "pizzas_toppings", joinColumns = @JoinColumn(name = "pizza_id"), inverseJoinColumns = @JoinColumn(name = "topping_id"))
    private List<Pizza> pizzaList;

    public Topping() {
    }

    public Topping(String descriptions, int calories, double price) {
        super(descriptions, calories, price);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "descriptions='" + descriptions + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

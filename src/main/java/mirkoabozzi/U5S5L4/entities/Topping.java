package mirkoabozzi.U5S5L4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("topping")
public class Topping extends Product {
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizzaId;

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

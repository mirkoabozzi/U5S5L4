package mirkoabozzi.U5S5L4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("drink")
public class Drink extends Product {
    private double quantity;

    public Drink(String descriptions, int calories, double price, double quantity) {
        super(descriptions, calories, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "quantity=" + quantity +
                ", descriptions='" + descriptions + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

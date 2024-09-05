package mirkoabozzi.U5S5L4.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Topping extends Product {


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

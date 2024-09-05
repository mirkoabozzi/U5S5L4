package mirkoabozzi.U5S5L4.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Pizza extends Product {
    private List<Topping> toppingList;

    public Pizza(String descriptions, int calories, double price) {
        super(descriptions, calories, price);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppingList=" + toppingList +
                ", descriptions='" + descriptions + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

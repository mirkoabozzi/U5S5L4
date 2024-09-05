package mirkoabozzi.U5S5L4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@DiscriminatorValue("pizza")
public class Pizza extends Product {
    @OneToMany(mappedBy = "pizzaId")
    private List<Topping> toppingList;

    public Pizza() {
    }

    public Pizza(String descriptions, int calories, double price, List<Topping> toppingList) {
        super(descriptions, calories, price);
        this.toppingList = toppingList;
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

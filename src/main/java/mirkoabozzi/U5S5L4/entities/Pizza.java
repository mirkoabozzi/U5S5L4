package mirkoabozzi.U5S5L4.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@DiscriminatorValue("pizza")
public class Pizza extends Product {
    @ManyToMany(mappedBy = "pizzaList", fetch = FetchType.EAGER)
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

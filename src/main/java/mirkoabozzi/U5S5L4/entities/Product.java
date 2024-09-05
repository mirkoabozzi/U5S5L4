package mirkoabozzi.U5S5L4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter

@Entity
@Table(name = "product")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type")
public abstract class Product {
    protected String descriptions;
    protected int calories;
    protected double price;
    @Id
    @GeneratedValue
    private UUID id;

    public Product() {
    }

    public Product(String descriptions, int calories, double price) {
        this.descriptions = descriptions;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "descriptions='" + descriptions + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}

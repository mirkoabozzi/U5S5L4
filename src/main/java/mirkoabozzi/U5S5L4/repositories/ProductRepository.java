package mirkoabozzi.U5S5L4.repositories;

import mirkoabozzi.U5S5L4.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    boolean existsByDescriptions(String description);

    List<Product> findByPrice(Double price);

    @Query("SELECT p FROM Product p WHERE p.pizza.calories >= :calories OR p.drink.calories >= :calories OR p.topping.calories >= :calories")
    List<Product> findProductUpToKcal(int calories);
}

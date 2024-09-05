package mirkoabozzi.U5S5L4.repositories;

import mirkoabozzi.U5S5L4.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    boolean existsByDescriptions(String description);
}

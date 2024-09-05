package mirkoabozzi.U5S5L4.services;

import mirkoabozzi.U5S5L4.entities.Product;
import mirkoabozzi.U5S5L4.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public void saveProduct(Product product) {
        productRepository.save(product);
        System.out.println("Nuovo prodotto " + product.getDescriptions() + " salvato nel db");
    }
}

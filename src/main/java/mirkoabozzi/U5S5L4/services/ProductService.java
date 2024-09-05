package mirkoabozzi.U5S5L4.services;

import mirkoabozzi.U5S5L4.entities.Product;
import mirkoabozzi.U5S5L4.exceptions.NotFoundEx;
import mirkoabozzi.U5S5L4.exceptions.ProductAlreadyOnDb;
import mirkoabozzi.U5S5L4.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public void saveProduct(Product product) {
        if (productRepository.existsByDescriptions(product.getDescriptions()))
            throw new ProductAlreadyOnDb(product.getDescriptions());
        productRepository.save(product);
        System.out.println("Nuovo prodotto " + product.getDescriptions() + " salvato nel db");
    }

    public Product getById(UUID id) {
        return productRepository.findById(id).orElseThrow(() -> new NotFoundEx(id));
    }

    public void delete(UUID id) {
        productRepository.delete(this.getById(id));
        System.out.println("Prodotto con id " + id + " eliminato correttamente");
    }

    public List<Product> findByPrice(Double price) {
        return productRepository.findByPrice(price);
    }

    public void updateProductName(UUID id, String description) {
        Product found = this.getById(id);
        found.setDescriptions(description);
        productRepository.save(found);
        System.out.println("Descrizione prodotto con id " + id + " aggiornata correttamente");
    }

    public List<Product> findByKcal(int kcal) {
        return productRepository.findProductUpToKcal(kcal);

    }
}

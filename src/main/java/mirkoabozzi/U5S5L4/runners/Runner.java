package mirkoabozzi.U5S5L4.runners;

import mirkoabozzi.U5S5L4.MenuConfiguration;
import mirkoabozzi.U5S5L4.entities.Drink;
import mirkoabozzi.U5S5L4.entities.Pizza;
import mirkoabozzi.U5S5L4.entities.Topping;
import mirkoabozzi.U5S5L4.exceptions.NotFoundEx;
import mirkoabozzi.U5S5L4.exceptions.ProductAlreadyOnDb;
import mirkoabozzi.U5S5L4.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    ProductService productService;
    @Autowired
    MenuConfiguration menuConfiguration;

    @Override
    public void run(String... args) throws Exception {

        try {
            Pizza pizzaProsciutto = menuConfiguration.getPizzaProsciutto();
            productService.saveProduct(pizzaProsciutto);
        } catch (ProductAlreadyOnDb ex) {
            System.out.println(ex.getMessage());
        }

        Pizza pizza1 = menuConfiguration.getPizzaPatatine();
//        productService.saveProduct(pizza1);

        Topping topping = menuConfiguration.getToppingProsciutto();
//        productService.saveProduct(topping);

        Topping topping1 = menuConfiguration.getToppingPatatine();
//        productService.saveProduct(topping1);

        Topping topping2 = menuConfiguration.getToppingMargherita();
//        productService.saveProduct(topping2);

        Drink drink = menuConfiguration.getBeer();
//        productService.saveProduct(drink);

        Drink drink1 = menuConfiguration.getDrinkCocaCola();
//        productService.saveProduct(drink1);

        try {
//            productService.delete(UUID.fromString("e828d426-d29d-4c49-ad08-ac9db4d623d9"));
        } catch (NotFoundEx ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Find by price");
            productService.findByPrice(1.00).forEach(System.out::println);
        } catch (NotFoundEx ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Update name");
            productService.updateProductName(UUID.fromString("eed91556-1671-4916-8495-5a18e238a7bf"), "coca cola 33");
        } catch (NotFoundEx ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Find kcal");
            productService.findByKcal(200).forEach(System.out::println);
        } catch (NotFoundEx ex) {
            System.out.println(ex.getMessage());
        }


    }
}

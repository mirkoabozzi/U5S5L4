package mirkoabozzi.U5S5L4.runners;

import mirkoabozzi.U5S5L4.MenuConfiguration;
import mirkoabozzi.U5S5L4.entities.Drink;
import mirkoabozzi.U5S5L4.entities.Pizza;
import mirkoabozzi.U5S5L4.entities.Topping;
import mirkoabozzi.U5S5L4.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    ProductService productService;
    @Autowired
    MenuConfiguration menuConfiguration;

    @Override
    public void run(String... args) throws Exception {

        Pizza pizzaProsciutto = menuConfiguration.getPizzaProsciutto();
//        productService.saveProduct(pizzaProsciutto);

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


    }
}

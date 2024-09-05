package mirkoabozzi.U5S5L4.exceptions;

public class ProductAlreadyOnDb extends RuntimeException {
    public ProductAlreadyOnDb(String str) {
        super("Il prodotto " + str + " è già presente nel DB");
    }
}

package mirkoabozzi.U5S5L4.exceptions;

import java.util.UUID;

public class NotFoundEx extends RuntimeException {
    public NotFoundEx(UUID id) {
        super("Prodotto con id " + id + " non trovato");
    }
}

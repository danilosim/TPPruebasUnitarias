import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    @Test
    void agregarProductoCarritoConCantidadCero() {
        Producto televisor = new Producto(1, "Televisor", "televisor LED", 4);
        Carrito carrito = new Carrito(televisor, 0);
        assertThrows(IllegalStateException.class, () -> new Carrito(televisor, 0));
    }

    @Test
    void eliminarProductoCarrito() {
    }
}
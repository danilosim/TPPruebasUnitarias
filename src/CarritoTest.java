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
    void crearDetallePorProducto(){
        int cantidadDetallesEsperada = 2;
        Producto televisor = new Producto(1, "Televisor", "televisor LED", 4);
        Carrito carrito = new Carrito(televisor, 2);
        Producto microondas = new Producto(2, "Microondas", "MO-215", 12);
        carrito.agregarProductoCarrito(microondas,2);
        assertEquals(cantidadDetallesEsperada, carrito.getDetallesCarrito().size());
    }

    @Test
    void agregarProductoExistenteEnCarrito(){
        int cantidadTelevisoresEsperada = 8;
        Producto televisor = new Producto(1, "Televisor", "televisor LED", 14);
        Carrito carrito = new Carrito(televisor, 3);
        carrito.agregarProductoCarrito(televisor, 5);
        assertEquals(cantidadTelevisoresEsperada, carrito.getDetallesCarrito().get(0).getCantidad());
    }


    @Test
    void eliminarProductoCarrito() {
    }
}
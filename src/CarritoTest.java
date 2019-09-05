import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    @org.junit.jupiter.api.Test
    void agregarProductoCarrito() {
        int numeroDetalles = 2;
        Producto prod1 = new Producto(1, "microondas", "ACME", 15);
        Producto prod2 = new Producto(2,"lavavajillas", "ARISTON", 25);
        DetalleCarrito detalleInicial = new DetalleCarrito(prod1,1);
        List<DetalleCarrito> detalleCreacionCarrito = new ArrayList<>();
        detalleCreacionCarrito.add(detalleInicial);
        Carrito carrito = new Carrito(detalleCreacionCarrito);
        carrito.agregarProductoCarrito(prod2, 3);// se tendria que generar el segundo detalle
        assertEquals(numeroDetalles, carrito.detalleCarrito.size());
    }

    @org.junit.jupiter.api.Test
    void eliminarProductoCarrito() {
    }
}
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DetalleCarritoTest {

    @org.junit.jupiter.api.Test
    void getProductos() {
    }

    @org.junit.jupiter.api.Test
    void setProductos() {
    }

    @org.junit.jupiter.api.Test
    void getCantidad() {
    }

    @org.junit.jupiter.api.Test
    void setCantidad() {
        int numeroDetalles = 0;
        Producto prod1 = new Producto(1, "microondas", "ACME", 15);
        DetalleCarrito detalleInicial = new DetalleCarrito(prod1,1);
        List<DetalleCarrito> detalleCreacionCarrito = new ArrayList<>();
        detalleCreacionCarrito.add(detalleInicial);
        Carrito carrito = new Carrito(detalleCreacionCarrito);
        carrito.eliminarProductoCarrito(prod1, 1);
        assertEquals(numeroDetalles, carrito.detalleCarrito.size());
    }

    @org.junit.jupiter.api.Test
    void getProducto() {
    }

    @org.junit.jupiter.api.Test
    void setProducto() {
    }
}
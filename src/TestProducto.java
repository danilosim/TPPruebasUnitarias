import static org.junit.Assert.*;


import org.junit.Test;

public class TestProducto {

	@Test(expected = IllegalArgumentException.class)
	public void testProductoSinNombre() {
		Producto productoSinNombre = new Producto(1,null , "Producto de Limpieza", 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testProductoSinDescripcion() {
		Producto productoSinDescripcion = new Producto(2, "Coca Cola", null, 40);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCrearProductoSinStock(){
		Producto productoSinStock = new Producto(3,"Alfajores Grandote","Comida",0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProductoSinNombreDescripcionStock(){
		Producto productoSinNombreDescripcionStock = new Producto(4,null,null,0);
	}

}

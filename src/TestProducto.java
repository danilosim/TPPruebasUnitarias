import static org.junit.Assert.*;


import org.junit.Test;

public class TestProducto {

	@Test(expected = IllegalArgumentException.class)
	public void testProductoSinNombre() { //PRUEBA 9
		Producto productoSinNombre = new Producto(1,null , "Producto de Limpieza", 1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testProductoSinDescripcion() { //PRUEBA 10
		Producto productoSinDescripcion = new Producto(2, "Coca Cola", null, 40);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCrearProductoSinStock(){ //PRUEBA 11
		Producto productoSinStock = new Producto(3,"Alfajores Grandote","Comida",0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProductoSinNombreDescripcionStock(){ //PRUEBA 13
		Producto productoSinNombreDescripcionStock = new Producto(4,null,null,0);
	}

}

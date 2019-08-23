
public class DetalleCarrito {
	Producto producto;

	private int cantidad = 0;
	
	public DetalleCarrito(Producto prod, int cantidad) {
		// metodo a testear
		this.producto = producto;
		this.cantidad = cantidad;
	}
}
	public DetalleCarrito(List<Producto> prods) {

		for (Producto producto : prods) {
			//checkear que todos sean el mismo producto
			// no implementado
		}
		this.productos = prods;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}

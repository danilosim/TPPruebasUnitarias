
public class DetalleCarrito {
	List<Producto> productos;

	private int cantidad = 0;
	
	public DetalleCarrito(Producto prod) {
		// metodo a testear
		this.productos = new ArrayList<>();
		this.productos.add(prod);
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

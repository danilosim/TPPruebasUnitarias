import java.util.List;

public class DetalleCarrito {
	private Producto producto;
	private List<Producto> productos;
	private int cantidad = 0;
	
	public DetalleCarrito(Producto producto, int cantidad) {
		// metodo a testear
		this.producto = producto;
		this.cantidad = cantidad;
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

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}

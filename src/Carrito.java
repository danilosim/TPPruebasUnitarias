import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private List<DetalleCarrito> detallesCarrito = new ArrayList<>();
	private int idCarrito;

	public Carrito(Producto producto, int cantidad) {
		if (cantidad > 0 && cantidad < producto.getStock()) {
			detallesCarrito.add(new DetalleCarrito(producto, cantidad));
			producto.setStock(producto.getStock()-cantidad);
		}
		else {
			throw new IllegalStateException();
		}
	}

	public Carrito() {
		throw new IllegalStateException();
	}

	public void agregarProductoCarrito(Producto prod, int cant) {
		if(cant > 0) {
			boolean same = false;
			for (DetalleCarrito detalle : this.detallesCarrito) {
				if (detalle.getProducto().getId() == prod.getId()){
					detalle.setCantidad(detalle.getCantidad() + cant);
					same = true;
					break;
				}
			}
			if (!same){
				this.detallesCarrito.add(new DetalleCarrito(prod, cant));
			}

		} else {
			throw new IllegalArgumentException();

		}
	}

	
	public void eliminarProductoCarrito(Producto prod) {

		DetalleCarrito toRemove = null;

		boolean same = false;
		for (DetalleCarrito detalle : this.detallesCarrito) {
			if (detalle.getProducto().getId() == prod.getId()){
				toRemove = detalle;
			}
		}

		if(toRemove != null){
			Producto producto = toRemove.getProducto();
			producto.setStock(producto.getStock() + toRemove.getCantidad());
			this.detallesCarrito.remove(toRemove);
		} else {
			throw new IllegalStateException();
		}

	}

	public List<DetalleCarrito> getDetallesCarrito() {
		return detallesCarrito;
	}

	public void setDetallesCarrito(List<DetalleCarrito> detallesCarrito) {
		this.detallesCarrito = detallesCarrito;
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}
}





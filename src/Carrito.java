import java.util.ArrayList;
import java.util.List;

public class Carrito {
	List<DetalleCarrito> detalleCarrito;

	public Carrito(List<DetalleCarrito> detalleCarrito) {
		if(detalleCarrito.size()!= 0) {
			this.detalleCarrito = detalleCarrito;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public Carrito() {
		throw new IllegalStateException();
	}

	public void agregarProductoCarrito(Producto prod, int cant) {
		if(cant != 0 && cant > 0) {
			boolean same = false;
			for (DetalleCarrito detalle : this.detalleCarrito) {
				if (detalle.getProducto().getId() == prod.getId()){
					detalle.setCantidad(detalle.getCantidad() + cant);
					same = true;
					break;
				}
			}
			if (!same){
				this.detalleCarrito.add(new DetalleCarrito(prod, cant));
			}

		}
		else {
			throw new IllegalArgumentException();

		}
	}

	
	public void eliminarProductoCarrito(Producto prod, int cant) {
		List<Object> toRemove = new ArrayList<Object>();
		if(cant > 0) {
			boolean same = false;
			for (DetalleCarrito detalle : this.detalleCarrito) {
				if (detalle.getProducto().getId() == prod.getId()){
					if (cant < detalle.getCantidad()){
						detalle.setCantidad(detalle.getCantidad() - cant);
					} else {
						toRemove.add(detalle);
						this.detalleCarrito.removeAll(toRemove);
					}
					detalle.setCantidad(detalle.getCantidad() + cant);
					same = true;
					break;
				}
			}

			if (!same){
				throw new IllegalArgumentException();
			}

		}
		else {
			throw new IllegalArgumentException();

		}
	}
}





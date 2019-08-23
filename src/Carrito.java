import java.util.ArrayList;
import java.util.List;

public class Carrito {
	List<DetalleCarrito> detalleCarrito;
	
	public void CrearCarrito(List<DetalleCarrito> detalle)  {
		if(detalle.size()!= 0) {
			this.detalleCarrito = detalle;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public void AgregarProductoCarrito(Producto prod, int cant) {
		if(cant != 0 && cant > 0 ) {

			for (DetalleCarrito detalle : this.detalleCarrito) {
				if (detalle.get(0).getId() == prod.getId()){
					for (int i = 0; i < cant; i++) {
						detalle.add(prod)
					}
				}
			}
		}
		else {
			throw new IllegalArgumentException();

		}
		if(cant != 0 && cant > 0 ) {
			if(prod.stock > cant) {
				DetalleCarrito detalle1 = new DetalleCarrito(prod);
				List<DetalleCarrito> detalleCarrito1 = new ArrayList<>();
				detalleCarrito1.add(detalle1);
				this.detalleCarrito = detalleCarrito1;
			}
		}


	}

	
	public void EliminarProductoCarrito(Producto prod) {
		
	}
}





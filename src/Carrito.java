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
		if(cant != 0 || cant > 0 ) {
			if(prod.stock > cant) {
				DetalleCarrito detalle1 = new DetalleCarrito(prod);
				List<DetalleCarrito> detalleCarrito1 = new ArrayList<>();
				detalleCarrito1.add(detalle1);
				this.detalleCarrito = detalleCarrito1;
			}
		}
		
		else {
			throw new IllegalArgumentException();
			
		}
			
	}
	
	public void EliminarProductoCarrito(Producto prod) {
		
	}
}





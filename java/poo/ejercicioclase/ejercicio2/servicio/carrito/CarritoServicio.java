package poo.ejercicioclase.ejercicio2.servicio.carrito;

import poo.ejercicioclase.ejercicio2.domain.Carrito;
import poo.ejercicioclase.ejercicio2.domain.Producto;

public interface CarritoServicio {
    void addProduct(Producto prod, int qty);

    boolean cerrarCarrito();
}

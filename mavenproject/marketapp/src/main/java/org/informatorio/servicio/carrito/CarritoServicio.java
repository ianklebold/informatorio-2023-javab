package org.informatorio.servicio.carrito;


import org.informatorio.domain.Producto;

public interface CarritoServicio {
    void addProduct(Producto prod, int qty);

    boolean cerrarCarrito();
}

package poo.ejercicioclase.ejercicio2.servicio.stock;

import poo.ejercicioclase.ejercicio2.domain.Producto;

public interface StockServicio {
    void modificarCantidad(Long idProducto, int qty);
}

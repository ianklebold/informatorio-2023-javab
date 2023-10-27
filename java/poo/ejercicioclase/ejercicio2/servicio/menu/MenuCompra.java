package poo.ejercicioclase.ejercicio2.servicio.menu;

import poo.ejercicioclase.ejercicio2.domain.Producto;

import java.util.Optional;

public interface MenuCompra {
    Optional<Producto> seleccionarProducto();

    int seleccionarCantidad();

    void mostarProductos();

}

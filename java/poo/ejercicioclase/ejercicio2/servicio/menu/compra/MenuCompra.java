package poo.ejercicioclase.ejercicio2.servicio.menu.compra;

import poo.ejercicioclase.ejercicio2.domain.Producto;
import poo.ejercicioclase.ejercicio2.enums.EstadoPedido;

import java.util.Optional;

public interface MenuCompra {
    Optional<Producto> seleccionarProducto();

    int seleccionarCantidad();

    void mostarProductos();

}

package org.informatorio.servicio.menu.compra;


import org.informatorio.domain.Producto;

import java.util.Optional;

public interface MenuCompra {
    Optional<Producto> seleccionarProducto();

    int seleccionarCantidad();

    void mostarProductos();

}

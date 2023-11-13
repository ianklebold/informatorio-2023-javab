package org.informatorio.servicio.producto;

import org.informatorio.basededatos.BdProductos;
import org.informatorio.domain.Producto;

import java.util.Optional;

public class ProductoServicioImpl implements ProductoServicio{
    @Override
    public Optional<Producto> getProductById(Long id) {
        Producto producto = BdProductos.getProductById(id);

        if (producto == null){
            return Optional.empty();
        }else {
            return Optional.of(producto);
        }

    }
}

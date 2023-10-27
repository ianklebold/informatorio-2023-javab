package poo.ejercicioclase.ejercicio2.servicio.producto;

import poo.ejercicioclase.ejercicio2.basededatos.BdProductos;
import poo.ejercicioclase.ejercicio2.domain.Producto;

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

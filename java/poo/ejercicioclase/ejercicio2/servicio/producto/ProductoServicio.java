package poo.ejercicioclase.ejercicio2.servicio.producto;

import poo.ejercicioclase.ejercicio2.domain.Producto;

import java.util.Optional;

public interface ProductoServicio {
    Optional<Producto> getProductById(Long id);
}

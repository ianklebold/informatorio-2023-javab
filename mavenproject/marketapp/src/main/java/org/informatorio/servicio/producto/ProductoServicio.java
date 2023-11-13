package org.informatorio.servicio.producto;


import org.informatorio.domain.Producto;

import java.util.Optional;

public interface ProductoServicio {
    Optional<Producto> getProductById(Long id);
}

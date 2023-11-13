package org.informatorio.servicio.archivos;

import org.informatorio.domain.Producto;

import java.util.List;

public interface ArchivosServicio {
    void exportarProductosACsv(List<Producto> productos, String nombreArchivo);
}

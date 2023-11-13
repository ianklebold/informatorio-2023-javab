package org.informatorio.servicio.archivos;

import com.opencsv.CSVWriter;
import org.informatorio.domain.Producto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArchivosServicioImpl implements ArchivosServicio{

    private final String UBICACION_ARCHIVO = "/src/main/java/org/informatorio/recursos/";

    @Override
    public void exportarProductosACsv(List<Producto> productos, String nombreArchivo) {
        System.out.println(System.getProperty("user.dir"));
        String ruta = System.getProperty("user.dir").concat(UBICACION_ARCHIVO).concat(nombreArchivo);
        try(CSVWriter writer = new CSVWriter(new FileWriter(ruta))){
            //Escribir encabezado
            String[] encabezados = {"ID","Nombre", "Precio", "Stock", "Descripcion"};
            writer.writeNext(encabezados);

            //Escribir datos de productos
            for (Producto producto: productos) {
                if (producto.getStock() > 0){
                    String[] datos = {
                            String.valueOf(producto.getId()),
                            producto.getNombre(),
                            String.valueOf(producto.getPrecio()),
                            String.valueOf(producto.getStock()),
                            producto.getDescription()
                    };
                    writer.writeNext(datos);
                }
            }
            //Cerrar escritor
            writer.close();
            System.out.println("Exportacion a CSV exitosa");
        } catch (IOException e ) {
            System.out.println("Algo salio mal motivo : " +
                    e.getMessage().concat(" Ubicacion indicada : " + ruta)
            );
        }
    }
}

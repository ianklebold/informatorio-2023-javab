package org.informatorio.servicio.menu.compra;



import org.informatorio.basededatos.BdProductos;
import org.informatorio.domain.Producto;
import org.informatorio.entrada.InputConsoleService;
import org.informatorio.servicio.carrito.CarritoServicioImpl;
import org.informatorio.servicio.producto.ProductoServicio;

import java.util.Optional;

public class MenuCompraImpl implements MenuCompra {

    public static final String MENSAJE_SELECCIONAR_PRODUCTO_TEMPLATE = "Elegir producto";

    public static final String MENSAJE_SELECCIONAR_CANTIDAD_TEMPLATE = "Selecciona la cantidad";

    private ProductoServicio productoServicio;

    public MenuCompraImpl() {
    }

    public MenuCompraImpl(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;

    }

    @Override
    public Optional<Producto> seleccionarProducto() {
        System.out.println(MENSAJE_SELECCIONAR_PRODUCTO_TEMPLATE);

        mostarProductos();

        Long idProduct = InputConsoleService.getScanner().nextLong();
        Optional<Producto> producto = productoServicio.getProductById(idProduct);

        if (producto.isEmpty()){
            System.out.println("No existe el producto con id : " + idProduct);
            return Optional.empty();
        }else {
            return producto;
        }

    }

    public void mostarProductos(){
        StringBuilder listaProductos = new StringBuilder();
        for (Producto p : BdProductos.productos) {
            if (p.getStock() != CarritoServicioImpl.CANTIDAD_MINIMA){
                listaProductos.append(String.format("ID[%d] %s: %s, %fUSD | stock %d.\n", p.getId(), p.getNombre(), p.getDescription(), p.getPrecio(), p.getStock()));
            }
        }
    }

    @Override
    public int seleccionarCantidad() {
        System.out.println(MENSAJE_SELECCIONAR_CANTIDAD_TEMPLATE);
        return InputConsoleService.getScanner().nextInt();
    }
}

package org.informatorio.servicio.menu.producto;


import org.informatorio.basededatos.BdProductos;
import org.informatorio.domain.Producto;

public class MenuProductoImpl implements MenuProducto{
    @Override
    public void mostrarProductos() {
        StringBuilder listaProductos = new StringBuilder();
        for (Producto p : BdProductos.productos) {
            listaProductos.append(String.format("ID[%d] %s: %s, %fUSD | stock %d.\n", p.getId(), p.getNombre(), p.getDescription(), p.getPrecio(), p.getStock()));
        }
        System.out.println(listaProductos);
    }
}

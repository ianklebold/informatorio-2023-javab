package org.informatorio;

import org.informatorio.basededatos.BdProductos;
import org.informatorio.domain.Carrito;
import org.informatorio.domain.Cliente;
import org.informatorio.domain.Producto;
import org.informatorio.entrada.InputConsoleService;
import org.informatorio.servicio.archivos.ArchivosServicioImpl;
import org.informatorio.servicio.carrito.CarritoServicio;
import org.informatorio.servicio.carrito.CarritoServicioImpl;
import org.informatorio.servicio.menu.compra.MenuCompra;
import org.informatorio.servicio.menu.compra.MenuCompraImpl;
import org.informatorio.servicio.menu.pedido.MenuPedidoImpl;
import org.informatorio.servicio.menu.pedido.MenuPedidos;
import org.informatorio.servicio.menu.principal.MenuPrincipal;
import org.informatorio.servicio.menu.principal.MenuPrincipalImpl;
import org.informatorio.servicio.menu.producto.MenuProducto;
import org.informatorio.servicio.menu.producto.MenuProductoImpl;
import org.informatorio.servicio.pedido.PedidoServicioImpl;
import org.informatorio.servicio.producto.ProductoServicioImpl;
import org.informatorio.servicio.stock.StockServicioImpl;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Carrito carritoEnCurso;

    public static void main( String[] args )
    {
        BdProductos.initProducts();
        //Creacion del cliente
        createClient();
        //Creacion de scanner
        InputConsoleService.createScanner();

        CarritoServicio carritoServicio = new CarritoServicioImpl(new StockServicioImpl(), new PedidoServicioImpl());
        MenuCompra menuCompra = new MenuCompraImpl(new ProductoServicioImpl());
        MenuPedidos menuPedidos = new MenuPedidoImpl(new PedidoServicioImpl());
        MenuProducto menuProducto = new MenuProductoImpl();
        ArchivosServicioImpl archivosServicio = new ArchivosServicioImpl();

        MenuPrincipal menuPrincipal = new MenuPrincipalImpl(carritoServicio,menuCompra,menuPedidos,menuProducto,archivosServicio);
        menuPrincipal.iniciar();

        //Cerrar el scanner
        InputConsoleService.closeScanner();
    }

    public static Carrito getCarritoEnCurso() {
        return carritoEnCurso;
    }

    public static void setCarritoEnCurso(Carrito carritoEnCurso) {

        carritoEnCurso.setId(1L);
        carritoEnCurso.setPedido(null);
        carritoEnCurso.setProducts(new HashMap<Producto, Integer>());

        App.carritoEnCurso = carritoEnCurso;
    }

    private static void createClient(){
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNombre("Ian");
        cliente.setDireccion("Calle falsa 123");
        cliente.setEmail("CorreoFalso@gmail.com");
        cliente.setCarrito(new Carrito());
        setCarritoEnCurso(cliente.getCarrito());
        getCarritoEnCurso().setCliente(cliente);
    }
}

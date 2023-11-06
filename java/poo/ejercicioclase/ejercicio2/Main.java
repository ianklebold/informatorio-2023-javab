package poo.ejercicioclase.ejercicio2;


import poo.ejercicioclase.ejercicio2.basededatos.BdProductos;
import poo.ejercicioclase.ejercicio2.domain.Carrito;
import poo.ejercicioclase.ejercicio2.domain.Cliente;
import poo.ejercicioclase.ejercicio2.domain.Producto;
import poo.ejercicioclase.ejercicio2.entrada.InputConsoleService;
import poo.ejercicioclase.ejercicio2.servicio.carrito.CarritoServicio;
import poo.ejercicioclase.ejercicio2.servicio.carrito.CarritoServicioImpl;
import poo.ejercicioclase.ejercicio2.servicio.menu.compra.MenuCompra;
import poo.ejercicioclase.ejercicio2.servicio.menu.compra.MenuCompraImpl;
import poo.ejercicioclase.ejercicio2.servicio.menu.pedido.MenuPedidoImpl;
import poo.ejercicioclase.ejercicio2.servicio.menu.pedido.MenuPedidos;
import poo.ejercicioclase.ejercicio2.servicio.menu.principal.MenuPrincipal;
import poo.ejercicioclase.ejercicio2.servicio.menu.principal.MenuPrincipalImpl;
import poo.ejercicioclase.ejercicio2.servicio.menu.producto.MenuProducto;
import poo.ejercicioclase.ejercicio2.servicio.menu.producto.MenuProductoImpl;
import poo.ejercicioclase.ejercicio2.servicio.pedido.PedidoServicio;
import poo.ejercicioclase.ejercicio2.servicio.pedido.PedidoServicioImpl;
import poo.ejercicioclase.ejercicio2.servicio.producto.ProductoServicioImpl;
import poo.ejercicioclase.ejercicio2.servicio.stock.StockServicioImpl;

import java.util.HashMap;
import java.util.Optional;

public class Main {

    private static Carrito carritoEnCurso;

    public static void main(String[] args) {
        BdProductos.initProducts();
        //Creacion del cliente
        createClient();
        //Creacion de scanner
        InputConsoleService.createScanner();

        CarritoServicio carritoServicio = new CarritoServicioImpl(new StockServicioImpl(), new PedidoServicioImpl());
        MenuCompra menuCompra = new MenuCompraImpl(new ProductoServicioImpl());
        MenuPedidos menuPedidos = new MenuPedidoImpl(new PedidoServicioImpl());
        MenuProducto menuProducto = new MenuProductoImpl();

        MenuPrincipal menuPrincipal = new MenuPrincipalImpl(carritoServicio,menuCompra,menuPedidos,menuProducto);
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
        carritoEnCurso.setProducts(new HashMap<>());

        Main.carritoEnCurso = carritoEnCurso;
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

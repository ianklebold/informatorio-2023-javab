package poo.ejercicioclase.ejercicio2;


import poo.ejercicioclase.ejercicio2.basededatos.BdProductos;
import poo.ejercicioclase.ejercicio2.domain.Carrito;
import poo.ejercicioclase.ejercicio2.domain.Cliente;
import poo.ejercicioclase.ejercicio2.domain.Producto;
import poo.ejercicioclase.ejercicio2.entrada.InputConsoleService;
import poo.ejercicioclase.ejercicio2.servicio.carrito.CarritoServicio;
import poo.ejercicioclase.ejercicio2.servicio.carrito.CarritoServicioImpl;
import poo.ejercicioclase.ejercicio2.servicio.menu.MenuCompra;
import poo.ejercicioclase.ejercicio2.servicio.menu.MenuCompraImpl;
import poo.ejercicioclase.ejercicio2.servicio.pedido.PedidoServicioImpl;
import poo.ejercicioclase.ejercicio2.servicio.producto.ProductoServicioImpl;
import poo.ejercicioclase.ejercicio2.servicio.stock.StockServicioImpl;

import java.util.HashMap;
import java.util.Optional;

public class Main {

    private static Carrito carritoEnCurso;

    public static void main(String[] args) {
        BdProductos.initProducts();

        
        //Creacion de scanner
        InputConsoleService.createScanner();
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNombre("Ian");
        cliente.setDireccion("Calle falsa 123");
        cliente.setEmail("CorreoFalso@gmail.com");
        cliente.setCarrito(new Carrito());
        setCarritoEnCurso(cliente.getCarrito());
        getCarritoEnCurso().setCliente(cliente);

        CarritoServicio carritoServicio = new CarritoServicioImpl(new StockServicioImpl(),
                new PedidoServicioImpl());
        MenuCompra menuCompra = new MenuCompraImpl(new ProductoServicioImpl());

        int opc;
        do {
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Comprar productos");
            System.out.println("4. Ver pedidos");
            System.out.println("0. Salir");

            System.out.println("Ingrese una opcion");
            opc = InputConsoleService.getScanner().nextInt();

            switch (opc){
                case 1:
                    getAllProducts();
                    System.out.println("Ver productos");
                    break;
                case 2:
                    Optional<Producto> productoOptional = menuCompra.seleccionarProducto();
                    if (productoOptional.isPresent()){
                        int cantidad = menuCompra.seleccionarCantidad();
                        carritoServicio.addProduct(productoOptional.get(),cantidad);
                    }
                    break;
                case 3:
                    // buyProducts(List<Long> idProductos);
                    /*
                        - Metodo que permita cerrar el carrito, pasar el pedido al estado PAGADO.
                        - Crear un carrito vacio para el cliente.
                        - Descontar el stock de los productos del carrito
                     */
                    boolean resultado = carritoServicio.cerrarCarrito();
                    if (Boolean.TRUE.equals(resultado)){
                        System.out.println("Carrito cerrado");
                    }else {
                        System.out.println("Algo salio mal!");
                    }
                    break;
                case 4:
                    // getOrders(String state); metodo que retorne los pedidos segun su estado. Si state == null devolver todos los pedidos
                    /*
                        - Metodo muestre por pantalla todos los pedidos del cliente si y solo si state es nulo
                        - Metodo que muestre por pantalla solo los pedidos del estado (state) dado.
                        Usar en state el enum EstadoPedido
                     */
                    System.out.println("Ver compras realizadas");
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error! Opcion invalida");
            }

        }while (opc != 0);

        InputConsoleService.closeScanner();
    }

    public static void getAllProducts() {
        StringBuilder listaProductos = new StringBuilder();
        for (Producto p : BdProductos.productos) {
            listaProductos.append(String.format("ID[%d] %s: %s, %fUSD | stock %d.\n", p.getId(), p.getNombre(), p.getDescription(), p.getPrecio(), p.getStock()));
        }
        System.out.println(listaProductos);
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
}

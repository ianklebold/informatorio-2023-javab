package poo.ejercicioclase.ejercicio2.servicio.menu.principal;

import poo.ejercicioclase.ejercicio2.domain.Producto;
import poo.ejercicioclase.ejercicio2.entrada.InputConsoleService;
import poo.ejercicioclase.ejercicio2.servicio.carrito.CarritoServicio;
import poo.ejercicioclase.ejercicio2.servicio.menu.compra.MenuCompra;
import poo.ejercicioclase.ejercicio2.servicio.menu.pedido.MenuPedidos;
import poo.ejercicioclase.ejercicio2.servicio.menu.producto.MenuProducto;

import java.util.Optional;

public class MenuPrincipalImpl implements MenuPrincipal{

    private CarritoServicio carritoServicio;
    private MenuCompra menuCompra;

    private MenuPedidos menuPedidos;

    private MenuProducto menuProducto;

    public MenuPrincipalImpl(CarritoServicio carritoServicio, MenuCompra menuCompra, MenuPedidos menuPedidos, MenuProducto menuProducto) {
        this.carritoServicio = carritoServicio;
        this.menuCompra = menuCompra;
        this.menuPedidos = menuPedidos;
        this.menuProducto = menuProducto;
    }

    @Override
    public void iniciar() {int opc;
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
                    menuProducto.mostrarProductos();
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
                    menuPedidos.mostrarPedidos();
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error! Opcion invalida");
            }

        }while (opc != 0);
    }
}

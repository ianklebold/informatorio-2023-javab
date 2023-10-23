package poo.ejercicioclase.ejercicio2;


import poo.ejercicioclase.ejercicio2.basededatos.BdProductos;
import poo.ejercicioclase.ejercicio2.domain.Carrito;
import poo.ejercicioclase.ejercicio2.domain.Cliente;
import poo.ejercicioclase.ejercicio2.domain.Pedido;
import poo.ejercicioclase.ejercicio2.domain.Producto;
import poo.ejercicioclase.ejercicio2.entrada.InputConsoleService;
import poo.ejercicioclase.ejercicio2.enums.EstadoPedido;

import java.util.Objects;

public class Main {
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
                    addProduct(cliente);
                    System.out.println("Comprar producto");
                    break;
                case 3:
                    // buyProducts(List<Long> idProductos);
                    /*
                        - Metodo que permita cerrar el carrito, pasar el pedido al estado PAGADO.
                        - Crear un carrito vacio para el cliente.
                        - Descontar el stock de los productos del carrito
                     */
                    System.out.println("Comprar producto");
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

    private static void addProduct(Cliente cliente) {
        System.out.println("Ingrese por favor el id del producto : ");
        Long idProducto = InputConsoleService.getScanner().nextLong();
        Producto producto = BdProductos.getProductById(idProducto);

        if (!Objects.isNull(producto)){
            if (cliente.getCarrito().getProductos().isEmpty()){
                //Crear pedido
                Pedido pedido = new Pedido();
                pedido.setCarrito(cliente.getCarrito());
                pedido.setId(1L);
                pedido.setCliente(cliente);
                pedido.setEstado(EstadoPedido.PENDIENTE);
                cliente.getPedidos().add(pedido);
            }
            cliente.getCarrito().addProduct(producto);
        }

    }

}

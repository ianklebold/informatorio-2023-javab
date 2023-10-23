package poo.ejercicioclase.ejercicio2;


import poo.ejercicioclase.ejercicio2.basededatos.BdProductos;
import poo.ejercicioclase.ejercicio2.domain.Producto;
import poo.ejercicioclase.ejercicio2.entrada.InputConsoleService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = BdProductos.getProducts();

        //Creacion de scanner
        InputConsoleService.createScanner();

        int opc = 0;
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
                    // getAllProducts(); metodo que liste todos los productos
                    System.out.println("Ver productos");
                    break;
                case 2:
                    // addProduct(id product); metodo que busque y cargue el producto al carrito
                    System.out.println("Comprar producto");
                    break;
                case 3:
                    // buyProducts(); metodo que realice la compra si y solo si carrito no esta vacio
                    System.out.println("Comprar producto");
                    break;
                case 4:
                    // getOrders(String state); metodo que retorne los pedidos segun su estado state. Si state == null devolver todos los pedidos
                    System.out.println("Ver compras realizadas");
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error! Opcion invalida");
            }

        }while (opc != 0);

        InputConsoleService.getScanner().close();
    }
}

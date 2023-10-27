package poo.ejercicioclase.ejercicio2.servicio.carrito;

import poo.ejercicioclase.ejercicio2.domain.Carrito;
import poo.ejercicioclase.ejercicio2.domain.Producto;

public class CarritoServicioImpl implements CarritoServicio{

    public static final String MENSAJE_CANTIDAD_MINIMA_TEMPLATE =  "Debe ingresar una cantidad mayor que 0";

    public static final int CANTIDAD_MINIMA = 0;

    public static final String MENSAJE_ALERTA_CANTIDAD_DISPONIBLE_TEMPLATE = "Solo quedan %d productos en stock";

    private Carrito carritoEnCurso;

    public CarritoServicioImpl(Carrito carritoEnCurso) {
        this.carritoEnCurso = carritoEnCurso;
    }

    @Override
    public void addProduct(Producto prod, int qty) {
        if(qty <= CANTIDAD_MINIMA){
            System.out.println(MENSAJE_CANTIDAD_MINIMA_TEMPLATE);
        } else {
            if(prod.getStock() < qty){
                System.out.println(String.format(MENSAJE_ALERTA_CANTIDAD_DISPONIBLE_TEMPLATE,prod.getStock()));
            } else if(carritoEnCurso.getProducts().containsKey(prod)){
                /*
                    Servicio de stock para modificar la cantidad del producto
                 */
                //this.modifyQty(prod, qty);
            } else {
                carritoEnCurso.getProducts().put(prod, qty);
                /*
                    Servicio de stock para modificar la cantidad del producto
                 */
                //prod.buy(qty);
            }
        }
    }
}

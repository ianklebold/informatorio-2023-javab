package poo.ejercicioclase.ejercicio2.servicio.pedido;

import poo.ejercicioclase.ejercicio2.domain.Carrito;
import poo.ejercicioclase.ejercicio2.domain.Pedido;

public interface PedidoServicio {

    void actualizarPedidoAPagado(Carrito carrito);

    Pedido crearPedido(Carrito carrito, Long idPedido);
}

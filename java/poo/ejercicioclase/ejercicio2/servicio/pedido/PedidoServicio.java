package poo.ejercicioclase.ejercicio2.servicio.pedido;

import poo.ejercicioclase.ejercicio2.domain.Carrito;
import poo.ejercicioclase.ejercicio2.domain.Cliente;
import poo.ejercicioclase.ejercicio2.domain.Pedido;
import poo.ejercicioclase.ejercicio2.enums.EstadoPedido;

import java.util.List;

public interface PedidoServicio {

    void actualizarPedidoAPagado(Carrito carrito);

    Pedido crearPedido(Carrito carrito, Long idPedido);

    List<Pedido> obtenerPedidos(EstadoPedido estadoPedido, Cliente cliente);
}

package org.informatorio.servicio.pedido;



import org.informatorio.domain.Carrito;
import org.informatorio.domain.Cliente;
import org.informatorio.domain.Pedido;
import org.informatorio.enums.EstadoPedido;

import java.util.List;

public interface PedidoServicio {

    void actualizarPedidoAPagado(Carrito carrito);

    Pedido crearPedido(Carrito carrito, Long idPedido);

    List<Pedido> obtenerPedidos(EstadoPedido estadoPedido, Cliente cliente);
}

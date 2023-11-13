package org.informatorio.servicio.pedido;



import org.informatorio.App;
import org.informatorio.domain.Carrito;
import org.informatorio.domain.Cliente;
import org.informatorio.domain.Pedido;
import org.informatorio.enums.EstadoPedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PedidoServicioImpl implements PedidoServicio {

    @Override
    public void actualizarPedidoAPagado(Carrito carrito) {
        carrito.getPedido().setEstado(EstadoPedido.PAGADO);

        //TODO Mandar esto a carrito Servicio Impl
        Carrito newCart = new Carrito(carrito.getId() + 1, App.getCarritoEnCurso().getCliente());
        App.getCarritoEnCurso().getCliente().setCarrito(newCart);
        App.setCarritoEnCurso(newCart);
    }

    @Override
    public Pedido crearPedido(Carrito carrito, Long idPedido) {

        Pedido pedido = new Pedido();

        if (Objects.isNull(idPedido)){
            pedido.setId(1L);
        }else {
            pedido.setId(idPedido + 1);
        }

        pedido.setEstado(EstadoPedido.PENDIENTE);
        pedido.setCliente(carrito.getCliente());
        pedido.setCarrito(carrito);

        return pedido;
    }


    @Override
    public List<Pedido> obtenerPedidos(EstadoPedido estadoPedido, Cliente cliente) {
        if (estadoPedido != null){
            List<Pedido> pedidos = new ArrayList<>();
            for (Pedido pedido:cliente.getPedidos()) {
                if (pedido.getEstado().equals(estadoPedido)){
                    pedidos.add(pedido);
                }
            }
            return pedidos;
        }
        return cliente.getPedidos();
    }
}

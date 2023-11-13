package org.informatorio.servicio.menu.pedido;


import org.informatorio.App;
import org.informatorio.domain.Pedido;
import org.informatorio.entrada.InputConsoleService;
import org.informatorio.enums.EstadoPedido;
import org.informatorio.servicio.pedido.PedidoServicio;

import java.util.List;

public class MenuPedidoImpl implements MenuPedidos{

    public static final String MENSAJE_SELECCIONAR_TIPO_PEDIDO = "Selecciona porfavor el tipo de pedido";

    private PedidoServicio pedidoServicio;

    public MenuPedidoImpl(PedidoServicio pedidoServicio) {
        this.pedidoServicio = pedidoServicio;
    }

    @Override
    public void mostrarPedidos() {
        System.out.println(MENSAJE_SELECCIONAR_TIPO_PEDIDO);
        System.out.println("TIPO DE PEDIDOS : " + EstadoPedido.PENDIENTE + " - " + EstadoPedido.PAGADO);
        String tipoPedido = InputConsoleService.getScanner().next();

        EstadoPedido tipoPedidoSeleccionado = getPedidoSeleccionado(tipoPedido.toUpperCase().replace(" ",""));

        List<Pedido> pedidos = pedidoServicio.obtenerPedidos(tipoPedidoSeleccionado, App.getCarritoEnCurso().getCliente());

        if (!pedidos.isEmpty()){
            for (Pedido pedido : pedidos) {
                System.out.println(pedido.toString());
            }
        }else {
            System.out.println("No existen pedidos para el tipo ingresado");
        }
    }

    private EstadoPedido getPedidoSeleccionado(String tipoPedido){

        return switch (EstadoPedido.valueOf(tipoPedido)){
            case PENDIENTE ->  EstadoPedido.PENDIENTE;
            case PAGADO ->  EstadoPedido.PAGADO;
            default ->  null;
        };

    }

}

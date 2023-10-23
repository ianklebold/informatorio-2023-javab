package poo.ejercicioclase.ejercicio2.domain;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private Long id;
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();
    private Pedido pedido;

    public Carrito() {
    }

    public Carrito(Long id, Cliente cliente, List<Producto> productos, Pedido pedido) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.pedido = pedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void addProduct(Producto product){
        this.getProductos().add(product);
    }
}

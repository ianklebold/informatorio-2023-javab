package poo.ejercicioclase.ejercicio2.domain;

import poo.ejercicioclase.ejercicio2.enums.EstadoPedido;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private Carrito carrito;

    private EstadoPedido estado;

    public Pedido() {}

    public Pedido(Long id, Cliente cliente, Carrito carrito, EstadoPedido estado) {
        this.id = id;
        this.cliente = cliente;
        this.carrito = carrito;
        this.estado = estado;
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

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente.getNombre() +
                ", estado=" + estado +
                '}';
    }
}

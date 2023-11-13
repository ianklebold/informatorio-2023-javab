package org.informatorio.domain;

public class Producto {
    private Long id;
    private String nombre;

    private Double precio;

    private int stock;

    private String description;

    public Producto() {
    }

    public Producto(Long id, String name, Double price, int stock, String descripcion) {
        this.id = id;
        this.nombre = name;
        this.precio = price;
        this.stock = stock;
        this.description = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

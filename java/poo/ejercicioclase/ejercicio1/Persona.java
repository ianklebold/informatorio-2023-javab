package poo.ejercicioclase.ejercicio1;

import java.time.LocalDate;

public class Persona {
    private Long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Vehiculo vehiculo;

    Persona(){}

    Persona(Long dni, String nombre, LocalDate fechaDeNacimiento, Vehiculo vehiculo){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setFechaDeNacimiento(fechaDeNacimiento);
        this.setVehiculo(vehiculo);
    }

    public Long getDni(){
        return this.dni;
    }

    public String getNombre(){
        return this.nombre;
    }

    public LocalDate getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }

    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

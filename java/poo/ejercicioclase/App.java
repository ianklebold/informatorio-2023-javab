package poo.ejercicioclase;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Marca 1",4,Boolean.FALSE,Boolean.TRUE,"100","0");

        Persona persona = new Persona(123456789L,"Ian", LocalDate.of(1999,8,10),vehiculo);

        System.out.println("Nombre de persona : " + persona.getNombre());
        System.out.println("Dni de persona : " + persona.getDni());
        System.out.println("Fecha de nacimiento  : " + persona.getFechaDeNacimiento());
        System.out.println("Marca de Vehiculo : " + persona.getVehiculo().getMarca());

        //Arrancamos vehiculo
        persona.getVehiculo().arrancarVehiculo();

        //Apaga la alarma
        persona.getVehiculo().setEstaLaAlarmaEncendida(Boolean.FALSE);

        //Arrancamos vehiculo
        persona.getVehiculo().arrancarVehiculo();
    }
}

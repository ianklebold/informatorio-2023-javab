package poo;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor
    Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    Persona(){}

    //Metodos
    //[clasificador] [tipoDeRetorno] nombreDelMetodo([<expresiones>])){}
    public String getNombre(){
        return this.nombre; //this hace referencia a si mismo
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

}

package poo;

public class App {
    public static void main(String[] args) {
        //<NombreClase> estaEsUnaVariable = new <NombreClase>([<expresiones>]);

        //Con new devolver la direccion que hace referencia al objeto creado
        Persona persona = new Persona(); //Instancia de un objeto

        //Asignacion de valores
        //persona.nombre = "Ian";
        //persona.apellido = "Fernandez";
        //persona.edad = 24;

        //Acceso a la informacion del objeto
        //System.out.println(persona.nombre);
        //System.out.println(persona.apellido);
        //System.out.println(persona.edad);

        persona.setNombre("Ian");
        persona.setApellido("Fernandez");
        persona.setEdad(24);

        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());

        persona.setNombre("Rodrigo");
        System.out.println("Nuevo nombre " + persona.getNombre());

        Persona persona2 = new Persona("Martin","Rodriguez",20);

        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());
        System.out.println(persona2.getEdad());
    }
}

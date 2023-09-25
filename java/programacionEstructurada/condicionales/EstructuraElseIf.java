package programacionEstructurada.condicionales;

public class EstructuraElseIf {
    public static void main(String[] args) {
        
        boolean esUnDiaDeClases = true;
        final String DIA = "Viernes";
        
        //if (esUnDiaDeClases){
        //    System.out.println("Hoy es : " + DIA + " si hay clases");
        //}else{
        //    System.out.println("Hoy es : " + DIA + " y no hay clases");
        //}

        if (esUnDiaDeClases && DIA == "Lunes"){
            System.out.println("Hoy es : " + DIA + " y no hay clases");
        
        }else if (!esUnDiaDeClases){
            System.out.println("Hoy es : "+ DIA +" y no hay clases");
        }else{
            System.out.println("Pasamos al else");
            if (DIA == "Viernes") {
                System.out.println("Hoy hay clases!");
            }else if (DIA == "Martes") {
                System.out.println("Ayer tuvimos clases");
            }else{
                System.out.println("No tengo informacion");
            }
        }


    }
}

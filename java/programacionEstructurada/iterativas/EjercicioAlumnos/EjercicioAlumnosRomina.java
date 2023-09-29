package programacionEstructurada.iterativas.EjercicioAlumnos;

//Creado por : Romina
public class EjercicioAlumnosRomina {
    public static void main(String[] args) {

        int min = 5;
        int max = 25;
        int contadorPrimos = 0;

        for (int i = min; i <= max; i++){
            int cont = 0;

            for (int j = i; j > 0 ; j-- ){
                if(i % j == 0){
                    cont++;
                }
                if(cont > 2){
                    System.out.println(i + " no es primo.");
                    break;
                }
            }

            if(cont <= 2){
                System.out.println(i + " es primo.");
                contadorPrimos++;
            }
        }
        System.out.println("Hay "+contadorPrimos+" números primos en el rango.");

    }
}

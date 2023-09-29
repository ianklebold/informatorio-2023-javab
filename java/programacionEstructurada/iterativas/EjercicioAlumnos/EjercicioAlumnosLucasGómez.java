package programacionEstructurada.iterativas.EjercicioAlumnos;

import java.util.Scanner;

//Creado por : Lucas Gómez
public class EjercicioAlumnosLucasGómez {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese el número mínimo: ");
        int minimo = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese el número máximo: ");
        int maximo = scanner2.nextInt();
        int cantidadPrimos = 0;

        for (int numero = minimo; numero <= maximo; numero++) {
            if (numero <= 2) {
                if (numero == 2) {
                    System.out.println(numero + " Es un valor primo");
                    cantidadPrimos++;
                }
            } else {
                boolean esPrimo = true;
                for (int divisor = 2; divisor < numero; divisor++) {
                    if (numero % divisor == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println(numero + " Es un valor primo");
                    cantidadPrimos++;
                }
            }
        }
        System.out.println("Cantidad de números primos entre " + minimo + " y " + maximo + " : " + cantidadPrimos);
        scanner1.close();
        scanner2.close();
    }
}

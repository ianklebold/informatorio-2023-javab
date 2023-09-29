package programacionEstructurada.iterativas.EjercicioAlumnos;

import java.util.Scanner;

//Creado por : Cristian Popoff
public class EjercicioAlumnosCristianPopoff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es el número de inicio del rango? ");
        int min = scanner.nextInt();

        System.out.print("¿Cuál es el número de fin del rango? ");
        int max = scanner.nextInt();
        int nPrimos = 0;

        boolean[] primos = new boolean[max + 1];

        for (int i = 0; i <= max; i++) {
            primos[i] = false;
        }

        for (int i = min; i <= max; i++) {
            if (!primos[i]) {
                primos[i] = esPrimo(i);

                if (primos[i]) {
                    nPrimos++;
                }
            }
        }

        System.out.println("Números primos en el rango: ");
        for (int i = min; i <= max; i++) {
            if (primos[i]) {
                System.out.println(i);
            }
        }

        System.out.println("Número de números primos: " + nPrimos);
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

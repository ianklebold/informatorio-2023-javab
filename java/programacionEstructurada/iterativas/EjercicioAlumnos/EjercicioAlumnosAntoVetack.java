package programacionEstructurada.iterativas.EjercicioAlumnos;

//Creado por : Anto Vetack
public class EjercicioAlumnosAntoVetack {
    public static void main(String[] args) {
        //Todo dado un rango de numeros, contar los numeros que van desde Min a Max que son primos y mostrarlos por pantalla.
        
        int min = 1;  // Valor mínimo del rango
        int max = 50;  // Valor máximo del rango
        int countPrimos = 0;

        for (int numero = min; numero <= max; numero++) {
            if (numero <= 2) {
                // ... -1, 0, 1, 2
                if (numero == 2) {
                    System.out.println(numero + " Es un valor primo");
                    countPrimos++;
                }
            } else {
                // 3, 4, 5 ....
                boolean esPrimo = true;
                for (int divisor = 2; divisor < numero; divisor++) {
                    if (numero % divisor == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println(numero + " Es un valor primo");
                    countPrimos++;
                }
            }
        }
        System.out.println("Hay " + countPrimos + " numeros primos entre " + min + " y " + max + ".");
    }
}

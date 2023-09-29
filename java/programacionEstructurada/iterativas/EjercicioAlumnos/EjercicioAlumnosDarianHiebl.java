package programacionEstructurada.iterativas.EjercicioAlumnos;


//Creado por : Darian Alexis Hiebl
import java.util.Scanner;

public class EjercicioAlumnosDarianHiebl {
    public static void main(String[] args) {
        
        int num, cont, min;
        cont = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un minimo entre 1 y 999");
        min = scanner.nextInt();
        System.out.println("Ingrese un maximo entre 1 y 1000");
        num = scanner.nextInt();
        while (num <0 || num > 1000 || num < min){
            System.out.println("Debe ingresar un numero entre 1 y 1000 y maximo mayor a minimo");
            System.out.println("Ingrese nuevamente un minimo:");
            min = scanner.nextInt();
            System.out.println("Ingrese nuevamente un maximo:");
            num = scanner.nextInt();
        }


        for (int i = min ; i <= num; i++){
            boolean esDivisible = false;
            if (i==2){
                System.out.println(i + " es primo.");
                continue;
            }
            for (int j = i - 1; j > 1; j--){
                if (i%j == 0){
                    esDivisible = true;
                }
                if (esDivisible){
                    // System.out.println(i + " no es primo.");
                    esDivisible = false;
                    break;
                } else if (j == 2){
                    System.out.println(i + " es primo.");
                    cont ++;
                } 
            }
        }
        System.out.println("Hay "+ cont + " numero primos del " + min + " al " + num);
    }
}

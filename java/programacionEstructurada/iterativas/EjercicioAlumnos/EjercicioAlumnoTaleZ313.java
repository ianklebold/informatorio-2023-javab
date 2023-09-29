package programacionEstructurada.iterativas.EjercicioAlumnos;

//Creado por : TaleZ313
public class EjercicioAlumnoTaleZ313 {
    public static void main(String[] args) {
        //TODO Dado N numeros, indicar si los numeros que van desde el 1 a N (N incluido) son primos o no.
        /*
         * 1 , 2, 3, 4, 5
         *
         * - Para valores menores a 2 son no primos.
         * - Tenemos que comprobar que dados los valores de 1 a N, que no exista un valor tal que el numero NUMER_EVALUACION % i = 0.
         *
         */
        int minimo = 173;
        int numero = 300;
        if(numero <= 2){
            //... -1, 0, 1, 2
            if (numero == 2) {
                System.out.println(numero + " Es un valor primo");
            }else{
                System.out.println(numero + " Es un valor no primo");
            }
        }else{
            //3, 4, 5 ....
            for (int i = minimo; i <= numero; i++) {
                for (int divisor = 2; divisor < i; divisor++) {

                    if (i % divisor == 0) {
                        //System.out.println(i + " Es un valor no primo");
                        break;
                    } else if (divisor == i - 1) //Si divisor es igual al numero anterior analizado
                    {
                        System.out.println(i + " Es un valor primo");
                    }
                }
            }
        }
        
    }
}

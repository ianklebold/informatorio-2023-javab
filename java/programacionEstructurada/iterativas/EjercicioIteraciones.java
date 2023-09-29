package programacionEstructurada.iterativas;

public class EjercicioIteraciones {
    public static void main(String[] args) {
        //TODO Dado N numeros, indicar si los numeros que van desde el 1 a N (N incluido) son primos o no.
        /*
         * 1 , 2, 3, 4, 5
         * 
         * - Para valores menores a 2 son no primos.
         * - Tenemos que comprobar que dados los valores de 1 a N, que no exista un valor tal que el numero NUMER_EVALUACION % i = 0.
         *
         */
        int numero = 173;
        if(numero <= 2){
            //... -1, 0, 1, 2
            if (numero == 2) {
                System.out.println(numero + " Es un valor primo");
            }else{
                System.out.println(numero + " Es un valor no primo");
            }
        }else{
            //3, 4, 5 ....
            for (int divisor = 2; divisor < numero; divisor++) {
                
                if (numero % divisor == 0){
                    System.out.println(numero + " Es un valor no primo");
                    break;
                }else if(divisor == numero-1) //Si divisor es igual al numero anterior analizado
                {
                    System.out.println(numero + " Es un valor primo");
                }
            }
        }


    }
}

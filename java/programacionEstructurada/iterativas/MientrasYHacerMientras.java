package programacionEstructurada.iterativas;

public class MientrasYHacerMientras {
    public static void main(String[] args) {
        //Bucle while
        /*
            While ( condición ) do
            { // Sentencias}
            Ejecuta el ciclo de 0 a N veces
        */
        int contador = 1;
        while (contador <= 10) {
            System.out.println("Hola ! soy el numero " + contador);
            contador = contador + 1; //contador++;
        }

        //Bucle do while
        /*
            Do{//Sentencias} 
            while ( condición )    
            Ejecuta de 1 a N veces
        */

        do {
            System.out.println("Adios soy el numero = " + contador);
            contador--; //contador = contador - 1;s
        } while (contador > 0);

        System.out.printf("Mi nombre es %s y mi edad es %d mi lenguaje preferido es : %s \n", "Ian",24,"Java");

    }
}

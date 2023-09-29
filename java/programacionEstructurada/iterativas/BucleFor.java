package programacionEstructurada.iterativas;

public class BucleFor {
    public static void main(String[] args) {
        //Bucle for - Conoces de antemano la cantidad de a iterar


        //Declaracion del indice  int i = 1
        //Condicion del contador  i <= 5
        // Incremento o descremento i++
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola mundo!");
        }

        boolean activador = false;

        for (int i = 5; activador &&  i > 0; i--) {
            System.out.println("Hola mundo! Bucle 2");
        }
        int j = 5;
        for (int i = 5; !activador &&  i > 0; i--) {

            while (j > 0) {
                j--;
                System.out.println("Bucle while");
                if (j % 2 == 0){
                    System.out.println("Soy par");
                }
            }
            j = 5;

        }

        for (int i = 0; i < 10; i++) {
            for (int k = 10; k > 0 ; k--) {
                System.out.println("Valor bucle 1 : " + i + " Valor bucle 2 : "+ k);
            }
        }




    }
}

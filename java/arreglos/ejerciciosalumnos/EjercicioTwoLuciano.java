package arreglos.ejerciciosalumnos;

public class EjercicioTwoLuciano {
    public static void main(String[] args) {

        int [] scores = new int[] {43, 43 , 500 , 399 , 125 , 21 , 82 };

        int [] mayores = new int[2];

        int maximo = 0;
        int maximodos = 0;

        for(int i = 0 ; i<scores.length; i++){

            if (scores[i] >= maximo) {
                maximo = scores[i];

            }
            else if (scores[i] >= maximodos){
                maximodos = scores[i];
            }
        }
        mayores[0] = maximo;
        mayores[1] = maximodos;

        System.out.println("El valor maximo es de " + mayores[0]  + " y su sucesor es " + mayores[1] );
    }
}

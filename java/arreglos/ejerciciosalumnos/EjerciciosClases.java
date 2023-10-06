package arreglos.ejerciciosalumnos;

public class EjerciciosClases {
    public static void main(String[] args) {
        /*
         * Escribe un programa que tome un array y cree otro array que contenga solo los elementos del medio,
           es decir, eliminando el primer y último elemento.

            myArray = [1, 2, 3, 4]
            middle(myArray)  # [2,3]

         */

        int miArray[] = {1,2,3,4};
        
        if(miArray == null || miArray.length <= 2){
            int resultado[] = new int[0];
            
            System.out.println("El arreglo es nulo o es de longitud menor o igual a dos :");
        }else{
            int resultado[] = new int[miArray.length-2];

            final int PRIMERA_POSICION = 0;
            final int ULTIMA_POSICION  = miArray.length - 1;
            
            for (int i = 0; i < miArray.length; i++) {
                
                if (i != PRIMERA_POSICION && i != ULTIMA_POSICION){
                    resultado[i-1] = miArray[i];
                    
                }

            }

            System.out.println("El resultado final es :");
            for (int i = 0; i < resultado.length; i++) {
                System.out.printf("Valor posicion [%d] = [%d] \n",i,resultado[i]);
            }

        }

    }
}

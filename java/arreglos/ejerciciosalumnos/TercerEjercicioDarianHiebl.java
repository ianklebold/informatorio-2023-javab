package arreglos.ejerciciosalumnos;

public class TercerEjercicioDarianHiebl {
    public static void main(String[] args) {
        
        int[] arr = {5,5,7,14,15,18,22,35};
        int primero, segundo;

        primero = Integer.MIN_VALUE;
        segundo=  Integer.MIN_VALUE;

        if (arr == null || arr.length <= 1){
            System.out.println("El arreglo es nulo o menor a 1");
        }else{
            for (int i = 0; i < arr.length; i ++){
                if (arr[i] > primero){
                    primero = arr[i];
                }
            }
            for (int i = 0; i< arr.length; i++ ){
                if (arr[i] > segundo && arr[i]<primero){
                    segundo = arr[i];
                }
            }
            if (segundo == Integer.MIN_VALUE){
                segundo = primero;
            }
        }

        System.out.println("El mayor es: " + primero + "\nEl segundo es: " + segundo);



    }
}

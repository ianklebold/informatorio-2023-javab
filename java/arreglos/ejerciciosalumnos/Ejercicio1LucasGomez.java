package arreglos.ejerciciosalumnos;

public class Ejercicio1LucasGomez {
    public static void main(String[] args) {
        int[] arreglo1 = {1,2,3,4};
        int[] nuevoArreglo = new int[arreglo1.length - 2];

        for (int i = 0; i < arreglo1.length; i++){
            if (i != 0 && i != (arreglo1.length - 1)){
                nuevoArreglo[i-1] = arreglo1[i];
            }         
        }
        System.out.println("Arreglo sin el primer y último elemento: ");
        for (int j = 0; j < nuevoArreglo.length; j++) {
            System.out.print(nuevoArreglo[j] + " ");
        }   

    }
}

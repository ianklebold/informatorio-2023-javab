package arreglos.ejerciciosalumnos;

public class Ejercicio2LucasGomez {
    public static void main(String[] args) {
        int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        int suma = 0;
        
        for (int i = 0; i < myArray2D.length; i++){
            for (int j = 0; j < myArray2D.length; j++){
                if (i == j){
                    suma += myArray2D[i][j];
                }
            }
        }
        System.out.println("La suma de los elementos del array en diagonal es: " + suma);
    }
}

package arreglos.ejerciciosalumnos;

public class Ejericicio2LuisMigliore {
  public static void main(String[] args) {

    int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int suma = 0;

    for (int i=0; i<array.length; i++){
      suma += array[i][i];
    }

    System.out.printf("\n La suma de la diagonal de la matriz es = %d. \n", suma);
  }
}

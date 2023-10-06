package arreglos.ejerciciosalumnos;

public class EjercicioLuisMigliore {
  public static void main(String[] args) {

    //int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int array[][] = {{1,23,3,5},{4,57,6,13},{7,87,91,24},{100,45,876,324}};
    int sumaDiagonal1 = 0;
    int sumaDiagonal2 = 0;

    for (int i=0; i<array.length; i++){
      sumaDiagonal1 += array[i][i];
      sumaDiagonal2 += array[i][array.length-(i+1)];
    }

    System.out.printf("\n La suma de la diagonal 1 de la matriz es = %d. \n", sumaDiagonal1);
    System.out.printf("\n La suma de la diagonal 2 de la matriz es = %d. \n", sumaDiagonal2);
  }
}

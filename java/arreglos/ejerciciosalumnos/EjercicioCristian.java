package arreglos.ejerciciosalumnos;

public class EjercicioCristian {

    public static void main(String[] args) {
        int [][] myArray2D = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int diagonalIzquierda = 0, diagonalDerecha = 0;
    
        for (int i = 0; i < myArray2D.length; i++) {
            for (int j = 0; j < myArray2D.length; j++) {
                if (i == j) {
                    diagonalIzquierda += myArray2D[i][j];
                }
                if (i+j == myArray2D.length - 1 ) {
                     diagonalDerecha += myArray2D[i][j];
                }
            }
        }
    
    
        System.out.println("La suma de la diagonal izquierda es: " + diagonalIzquierda);
        System.out.println("La suma de la diagonal derecha es: " + diagonalDerecha);
        System.out.println("La suma de sus diagonales es: " + (diagonalDerecha + diagonalIzquierda));
    
    }
    
}

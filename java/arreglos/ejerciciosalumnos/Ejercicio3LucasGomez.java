package arreglos.ejerciciosalumnos;

public class Ejercicio3LucasGomez {
    public static void main(String[] args) {
        int myArray[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int mejorValor = myArray[0];
        int segundoMejorValor = myArray[1];

        if (segundoMejorValor > mejorValor) {
            int variableTemporal = mejorValor;
            mejorValor = segundoMejorValor;
            segundoMejorValor = variableTemporal;
        }

        for (int i = 2; i < myArray.length; i++){
            if (mejorValor <= myArray[i]){
                segundoMejorValor = mejorValor;
                mejorValor = myArray[i];
            } else if (segundoMejorValor < myArray[i] && myArray[i] != mejorValor) {
                segundoMejorValor = myArray[i];
            }
        }
        System.out.println("El mejor valor del array es: " + mejorValor);
        System.out.println("El segundo mejor valor del array es: " + segundoMejorValor);
    }
}

package programacionImperativa.operandosOperadores;

public class IntroOperadorOperandos {
    public static void main(String[] args) {
        int resultado = 5 + 3 * 2;
        System.out.println("Resultado " + resultado);

        int resultado2 = 20/4 * 2 + 3;
        
        //Entre parentesis puede ir cualquier expresion siempre que devuelva un booleano
        //Operador ternario de java
        int resultado3 = (resultado2 > resultado)? 1 : 0;
        System.out.println(" Resultado de operador ternario : "+ resultado3);


        int value1 = 5;
        System.out.println(value1++);
        System.out.println(++value1);
        System.out.println(--value1);

        int value2 = 0;
        value2 += value1;
        value2 =+ value1;
        value2 =- value1;
        value2 -= value1;
        
    }
}

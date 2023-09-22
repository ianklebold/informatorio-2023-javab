package programacionImperativa.tiposDatos;

public class ByteShortLongAndWidth {
    
    public static void main(String[] args) {

        //Byte value - 8 bits - Clase wrapper
        System.out.println("Rango del valor del byte : "+ Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        
        byte minValue = -128;
        byte maxValue = 127;

        //Short value - 16 bits - Clase wrapper
        System.out.println("Rango del valor del short : "+ Short.MIN_VALUE + " " + Short.MAX_VALUE);
        
        short minValueShort = -32768;
        short maxValueShort = 32767;

        //Integer value - 32 bits - Clase Wrapper
        System.out.println("Rango del valor del integer : "+ Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        
        int minValueInt = -2147483648;
        int maxValueInt = 327671231;

        //Tipo Long
        long valorLong = 3276712313L;

        //SCREAMING_SNAKE_CASE
        //Declaracion de constante
        final long ESTA_ES_UNA_CONSTANTE = 3276712313L;
        
    }


}

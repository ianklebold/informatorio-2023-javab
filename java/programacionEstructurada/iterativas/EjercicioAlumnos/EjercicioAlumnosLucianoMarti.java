package programacionEstructurada.iterativas.EjercicioAlumnos;
//Creado por : Luciano Marti
public class EjercicioAlumnosLucianoMarti {
    public static void main(String[] args) {
        int contador = 0;
        int maximo = 10;
        // la variable numero es mi minimo 
        for (int numero = 2 ; numero<=maximo ; numero++ ){
            if(numero <= 2){
                //... -1, 0, 1, 2
                if (numero == 2) {
                contador++;
                }
            }else{
                //3, 4, 5 ....
                for (int divisor = 2; divisor < numero; divisor++) {

                    if (numero % divisor == 0){
                        break;
                    }else if(divisor == numero-1) //Si divisor es igual al numero anterior analizado
                    {
                        contador++;
                    }
                }
            }
        }
        System.out.println("La cantidad de primo es de " + contador);
    }
}

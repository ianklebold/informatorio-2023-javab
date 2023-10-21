package poo.principios.dominio;

public class Artista  extends Discografia{

    private String generoMusical;

    public Artista() {}

    public Artista(String generoMusical,String nombre) {
        this.nombre = nombre;
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarNombreEnMayuscula(){
        System.out.println("Metodo para artista");
        //Super utiliza el metodo del padre
        super.mostrarNombreEnMayuscula();
    }

    //Clase abstracta siempre implementan las clases hijas
    @Override
    public void mostrarNombreEnMinuscula() {
        System.out.println("Metodo para artista");
        System.out.println(this.nombre.toLowerCase());
    }


    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}

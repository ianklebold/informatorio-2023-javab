package poo.principios.dominio;

public class Cancion extends Discografia implements ElementoMusical{

    private String duracion;
    private Album album;

    @Override
    public void reproducirMusica(){
        System.out.println("\n Reproduciendo cancion "+ this.nombre);
    }

    @Override
    public void mostrarNombreEnMinuscula() {
        System.out.println(this.nombre.toLowerCase());
    }

    public Cancion(String duracion, Album album, String nombre) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.album = album;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }


}

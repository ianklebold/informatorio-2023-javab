package poo.principios.dominio;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Album extends Discografia implements ElementoMusical{
    private Year añoDeLanzamiento;
    private Artista artista;
    private List<Cancion> canciones = new ArrayList<>();

    public Album() {}

    public Album(Year añoDeLanzamiento, Artista artista, List<Cancion> canciones, String nombre) {
        this.nombre = nombre;
        this.añoDeLanzamiento = añoDeLanzamiento;
        this.artista = artista;
        this.canciones = canciones;
    }

    @Override
    public void reproducirMusica(){
        System.out.println("Reproduciendo album "+this.nombre);
        for (Cancion cancion:this.canciones) {
            cancion.reproducirMusica();
        }
    }

    public Year getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public void setAñoDeLanzamiento(Year añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }


    @Override
    public void mostrarNombreEnMinuscula() {
    }
}

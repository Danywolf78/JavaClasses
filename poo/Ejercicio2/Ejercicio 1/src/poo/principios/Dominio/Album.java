package poo.principios.Dominio;

import java.util.ArrayList;
import java.util.List;
import java.time.Year;

public class Album extends Discografia implements ElementoMusical{

    @Override
    public void reproducirMusica(){
        System.out.println("Reproduciendo album "+ this.nombre);
        for( Cancion cancion:this.canciones){
            cancion.reproducirMusica();
        }
    }

    private Year añoDelanzamiento;
    private Artista artista;
    private List<Cancion> canciones= new ArrayList<>();

    public Album() {
    }

    public Album(Year añoDelanzamiento, Artista artista, List<Cancion> canciones,String nombre) {
        this.nombre=nombre;
        this.añoDelanzamiento = añoDelanzamiento;
        this.artista = artista;
        this.canciones = canciones;
    }

    public Year getAñoDelanzamiento() {
        return añoDelanzamiento;
    }

    public void setAñoDelanzamiento(Year añoDelanzamiento) {
        this.añoDelanzamiento = añoDelanzamiento;
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
    public void mostrarNombreEnMinuscula(){
        System.out.println(this.nombre.toLowerCase());
    }
}

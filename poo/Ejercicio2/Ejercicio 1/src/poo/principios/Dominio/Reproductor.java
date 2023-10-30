package poo.principios.Dominio;

import java.time.Year;
import java.util.List;

public class Reproductor {
    public static void main(String[] args) {
        Album album=new Album();
        Artista artista=new Artista("Michael jackson","Pop");
        Cancion cancion=new Cancion("5 minutos",album,"Cancion 1");
        Cancion cancion2=new Cancion("3 minutos",album,"Cancion 2");
        Cancion cancion3=new Cancion("4 minutos",album,"Cancion 3");
    album.setArtista(artista);
    album.setNombre("Thriller");
    album.setAñoDelanzamiento(Year.of(1980));
    album.setCanciones(List.of(cancion,cancion2,cancion3));

    for (int i=0; i<4; i++){
        album.reproducirMusica();

        }
    }
}

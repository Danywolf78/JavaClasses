package poo.principios.Dominio;

public class Artista extends Discografia {

    private String generoMusical;

    public Artista() {
    }
    @Override
    public void mostrarNombreEnMayuscula(){
        System.out.println("Metodo para Artista");
        //Super utiliza el metodo del padre
        super.mostrarNombreEnMayuscula();
}
    //Clase abstracta siempre implementan las clases hijas no usages new*
    @Override
    public  void mostrarNombreEnMinuscula(){
        System.out.println("Metodo para Artista");
        System.out.println(this.nombre.toLowerCase());

    }
    public Artista(String nombre, String generoMusical) {
    this.nombre=nombre;
        this.generoMusical = generoMusical;
    }





    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}

package poo.principios.Dominio;

public abstract class Discografia {
        protected String nombre;


        public  void mostrarNombreEnMayuscula(){

        }
        public abstract void mostrarNombreEnMinuscula();

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
    }
}

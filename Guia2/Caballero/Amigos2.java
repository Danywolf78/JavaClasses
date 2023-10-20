package Guia2.Caballero;

/*Guarda en un arreglo una N cantidad de amigos,
itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo
es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a
ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que
mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su
edad. */
public class Amigos2 {
    public static void main(String[] args) {

        String[] amigos = { "Federico", "Miguel", "Martin", "Sebastian" };
        int[] edades = { 25, 16, 40, 17 };

        int mayor = 0;
        String amigoMayor = " ";

        for (int i = 0; i < amigos.length; i++) {
            if (edades[i] >= 18) {
                System.out.println("El amigo :" + amigos[i] + " es mayor de edad");
            } else {
                System.out.println("El amigo "+amigos[i]+"  es menor de edad");
            }
            if (edades[i] > mayor) {
                mayor = edades[i];
                amigoMayor = amigos[i];
            }

        }
    }

}

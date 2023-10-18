/*Guarda en variables el nombre de N cantidad de amigos,
itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este
amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje
diciendole a ese amigo porque no lo muestra por pantalla. */
public class Amigos {
    public static void main(String[] args) {
        String[] nombresAmigos = {"Juan", "Daniel", "Ruben", "Matias"};
        int[] edadesAmigos = {20, 17, 25, 15};

        for (int i = 0; i < nombresAmigos.length; i++) {
            String nombreAmigo = nombresAmigos[i];
            int edadAmigo = edadesAmigos[i];

            if (edadAmigo >= 18) {
                System.out.println("Nombre del amigo mayor de edad: " + nombreAmigo);
            } else {
                System.out.println("El amigo " + nombreAmigo + " es menor de edad y no se muestra por pantalla.");
            }
        }

    }
    
}

/*Modifique el ejercicio anterior en donde usted debe
crear un menú de opciones en donde en ese menú de opciones debe elegir qué
equipo de fútbol quiere saber la información del el ejercicio 11. */

import java.util.Scanner;

public class MenuJugadores {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String equipo1= "Centauro";
        String equipo2= "Jose Maria Paz";
        String entrenador1="Juan Maria";
        String entrenador2= "Matias";
        String jugador1=" Juan Maria ";
        String jugador11="Martin ";
        String jugador12="Daniel ";
        String jugador2=" Juan Maria ";
        String jugador21="Martin ";
        String jugador22="Daniel ";
        String equipoA = ("El Equipo :" +equipo1+" dirigido por "+ entrenador1 +" y sus jugadores son :" +jugador1+jugador11+jugador12 );
        String equipoB = ("El Equipo :" +equipo2+" dirigido por "+ entrenador2 +" y sus jugadores son :" +jugador2+jugador21+jugador22 );   
    
        
        System.out.println(" Menu ");
        System.out.println("Elija que Equipo quiere que se muestre");
        System.out.println("Quiere ver El equipo A, ingrese 1");
        System.out.println("Quiere ver El equipo B, ingrese 2");
        
        int opcion=sc.nextInt();

        if (opcion==1){
            System.out.println(equipoA);
        }else if(opcion==2){
            System.out.println(equipoB);
        }else {
            System.out.println("Vuelva a intentarlo, ingrese solomente 1 o 2");

        }
        sc.close();
    }
}

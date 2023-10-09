package clase.Guia1;

/*Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades. */

public class PromedioEdad {
    public static void main(String[] args) {
       float daniel=38;
       float jorge =24;
       float Juana= 30;
       String persona1="Daniel";
       String persona2="Jorge";
       String persona3= "Juana"; 
       float promedio= (daniel+jorge+Juana)/3;
       System.out.println("La edad de "+ persona1 +" es \n " + daniel );
       System.out.println("La edad de "+ persona2 +" es \n " + jorge );
       System.out.println("La edad de "+ persona3 +" es \n " + Juana );
       System.out.println("El promedio de edad de los tres es:  \n"+ promedio);
    }
    
}

package clase.Guia1;

/*1. Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número. */

public class Porcentaje {

    public static void main(String[] args) {
        Double primernumero = 4562.895;
        int segundonumero= 55;
        double porcentaje = (segundonumero*primernumero)/100;
        System.out.println(porcentaje+" es el "+ segundonumero+" %" +" del numero "+ primernumero);

    }
}

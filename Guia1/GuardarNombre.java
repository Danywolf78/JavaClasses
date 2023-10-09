package clase.Guia1;
/*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode? */

public class GuardarNombre {
     
    public static void main(String[] args){
        char Letra1 = '\u0044';
        char Letra2 = '\u0041';
        char Letra3 = '\u004E';
        char Letra4 = '\u0049';
        char Letra5 = '\u0045';
        char Letra6 = '\u004C';
        System.out.println("Ejercicio Caracteres \n" + Letra1 + Letra2 + Letra3 + Letra4 + Letra5 + Letra6 +
        "\n No se usa doble comilla en char porque no se puede asignar una cadena a un char");


    }
}

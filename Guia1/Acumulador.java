package clase.Guia1;

/*10. Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
El resultado mostrarlo por pantalla. */

public class Acumulador {
    public static void main(String[] args){
        double n1 = 10;
        double n2 = 3;
        double result = (n1*n2)/1+(n1*n2)/2+(n1*n2)/3+(n1*n2)/4+(n1*n2)/5+
        (n1*n2)/6+(n1*n2)/7+(n1*n2)/8+(n1*n2)/9+(n1*n2)/10+(n1*n2)/11+(n1*n2)/12        
        +(n1*n2)/13+(n1*n2)/14+(n1*n2)/15;
        
        System.out.println("El resultado es " + result);
    }
    
}

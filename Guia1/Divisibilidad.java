package clase.Guia1;
/*4. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado */
public class Divisibilidad {

    public static void main(String[] args) {
        int var1 = 27;
        int var2 = 6;
        int result= var1 % var2;
        if (result == 0){
            System.out.println("El numero "+ var1+"es divisible por "+ var2);}
        else 
            System.out.println("El numero "+ var1+" no es divisible por "+ var2);
        
        
        }       
    }
    


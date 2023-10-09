package clase.Imperativas;

public class ConversionDatos {
    public static void main(String[] args){
        //Promocion
        int value1 = 5;

        System.out.println("Valor por promocion " + value1);

        //Contraccion
        int value2 = (int)5.23f; //Parsing
        System.out.println("Valor por contraccion " + value2);
        
        int value3 = 10 + (int)20.5d;
        System.out.println("Valor por implicita " + value3);
        System.out.println( "     * \n " + "   ** \n"+"   *** \n"+"  **** \n"+" *****");

    }
    
}

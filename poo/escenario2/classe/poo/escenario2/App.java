package classe.poo.escenario2;

import classe.poo.escenario2.dominio.PrecioTachado;
import classe.poo.escenario2.dominio.Producto;
import classe.poo.escenario2.dominio.PrecioActual;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class App {
    //*Atributo global
   private static Scanner scanner= new Scanner(System.in);

public static  void main(String[] args){
        System.out.println(crearProducto().toString());
        /*
    Nos interesa tener la funcionalidad de poder carthar productos
        a partir de la consola, junto con sus precios y categorias

         */
}
private static Producto crearProducto(){
    Producto productoNuevo = new Producto();
    Scanner entrada= new Scanner(System.in);

    productoNuevo.setId(UUID.randomUUID());

    System.out.println("Ingrese el nombre del Producto  : ");
    /*String nombreProducto  = entrada.nextLine(); Es lo mismo*/
    productoNuevo.setNombre(getScanner().nextLine());
    System.out.println("Ingrese la descripcion del Producto  : ");
    productoNuevo.setDescripcion(getScanner().nextLine());
    productoNuevo.setPrecioActual(crearPrecioActual());

    System.out.println("Tienen Descuento? Si ingrese 1 - No ingrese 0 : ");
    int quieroDescuento = (getScanner().nextInt());

    if (quieroDescuento == 1){
        //Precio Tachado
        productoNuevo.setPrecioTachado((crearPrecioTachado(productoNuevo.getPrecioActual())));

        //Precio con Descuento
        productoNuevo.setPrecioActual(crearPrecioActual());


        double precioTachado = (int)productoNuevo.getPrecioTachado().getValor();
        double precioActual = (int)productoNuevo.getPrecioActual().getValor();
        int descuento =( (int)((1-(precioActual/precioTachado))*100));
        productoNuevo.setDescuento(descuento);
    }

    return productoNuevo;
}



    private static PrecioActual crearPrecioActual(){
        PrecioActual precioActual =new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioActual.setValor(getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());

        return precioActual;
    }
    private static PrecioTachado crearPrecioTachado(){
        PrecioTachado precioTachado= new PrecioTachado();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : " );
        precioTachado.setValor(getScanner().nextDouble());
        precioTachado.setFechaDeCarga(LocalDateTime.now());
        precioTachado.setFechaDeFinalizacion(LocalDateTime.of(2024,6,10,0,0));

    return precioTachado;
    }
    private static PrecioTachado crearPrecioTachado(PrecioActual precioActual){
    PrecioTachado precioTachado = new PrecioTachado();

    precioTachado.setValor(precioActual.getValor());
    precioTachado.setFechaDeCarga(precioActual.getFechaDeCarga());
    precioTachado.setFechaDeFinalizacion(precioActual.getFechaDeCarga());

    return precioTachado;
    }
    public static Scanner getScanner() {
        return scanner;
    }
}

package Ejerccicio1;


import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.MonthDay;
public class App {
    public static void main(String[] args) {
        Vehiculo vehiculo= new Vehiculo("Marca 1",4,Boolean.FALSE,Boolean.TRUE,"100","0");
        Persona persona= new Persona(123456789L,"Ian", LocalDate.of(1999,8,19),
                vehiculo );
        System.out.println("Nombre : "+ persona.getNombre());
        System.out.println("Dni :" + persona.getDni());
        System.out.println("fecha de Nacimiento :" + persona.getFechaDeNacimiento());
        System.out.println("Vehiculo :"+ persona.getVehiculo().getMarca());

        //Arrancamos el vahiculo
        persona.getVehiculo().arrancarVehiculo();

        //Quitamos la alarma
        persona.getVehiculo().setEstaLaAlarmaEncendida(Boolean.FALSE);

        //Arrancamos el vahiculo
        persona.getVehiculo().arrancarVehiculo();

            }
}

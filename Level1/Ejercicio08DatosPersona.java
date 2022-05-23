package Level1;
import java.util.Scanner;
/*
8.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/
public class Ejercicio08DatosPersona {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("------Datos de una Persona---------");
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Ingrese Apellidos......: ");
            String apellido = scan.nextLine();

            System.out.print("Ingrese Nombres .......: ");
            String nombres = scan.nextLine();

            System.out.print("Ingrese Edad...........: ");
            Integer edad = scan.nextInt();

            scan.nextLine();//Limpiamos buffer de entrada
            
            System.out.print("Ingrese Dirección......: ");
            String direccion = scan.nextLine();

            System.out.print("Ingrese Ciudad  .......: ");
            String ciudad = scan.nextLine();

            System.out.println("{"+ ciudad + "} - {" + direccion + "} - {" + Integer.toString(edad) + "} - {" + nombres + " " + apellido +"}");
            System.out.println("-----------------------------------");
            scan.close();
        }
    }
}

package Level1;

import java.util.Scanner;

public class Ejercicio01Saludar {

   public static void main(String[] args) {

    //creamos un objeto scanner para LLEr por consola
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Ingrese su nombre.... ");
    String nombre = scan.nextLine();

    System.out.println("HOLA " + nombre);
    
    scan.close();

   }
}

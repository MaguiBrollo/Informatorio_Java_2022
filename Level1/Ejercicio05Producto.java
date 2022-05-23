package Level1;

import java.util.Scanner;

/*5.	Se desea una aplicación que solicite 2 números enteros
 y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
 */

public class Ejercicio05Producto {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("------CALCULAR PRODUCTO------------");
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Ingrese 1er Número: ");
            int numero1 = scan.nextInt();

            System.out.print("Ingrese 2do Número: ");
            int numero2 = scan.nextInt();

            System.out.println("El producto de "+ numero1+" x "+ numero2 +" = " + producto(numero1,numero2));
            System.out.println("-----------------------------------");
            scan.close();
        }
    }

   public static int producto(int valor1, int valor2){
        int resultado = 0; 
        for( int i=1; i<=valor2; i++){
            resultado += valor1;
        }
        return resultado;
    } 
     
}

package Level1;

import java.util.Scanner;

/*
6.	Se desea una aplicación que solicite 2 números enteros
     y realice la operación de potencia (sin uso de librerías).
*/

public class Ejercicio06Potencia {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("------CALCULAR POTENCIA------------");
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Ingrese 1er Número (BASE)......: ");
            int numero1 = scan.nextInt();

            System.out.print("Ingrese 2do Número (EXPONENTE).: ");
            int numero2 = scan.nextInt();

            System.out.println("Potencia de "+ numero1+"^"+ numero2 +" = " + potencia(numero1,numero2));
            System.out.println("-----------------------------------");
            scan.close();
        }
    }

   public static int potencia(int valor1, int valor2){
    
        int resultado = 1; 
        for( int i=1; i<=valor2; i++){
            resultado *= valor1;
        }
        return resultado;
    } 
}

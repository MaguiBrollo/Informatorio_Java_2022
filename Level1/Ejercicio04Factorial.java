package Level1;

import java.util.Scanner;

public class Ejercicio04Factorial {
    public static void main(String[] args){
        
        System.out.println("------CALCULAR FACTORIAL------------");
        System.out.print("Ingrese Numero: ");
        try (Scanner scan = new Scanner(System.in)) {
            int numero = scan.nextInt();

            if (numero>0){
                System.out.println("El factorial de "+ numero+" es: "+factorial(numero));
            }else{
                System.out.println("El factorial no se puede calcular. \nDebe ingresar un numero mayor que cero.");
            }
            scan.close();
        }
    }

   public static int factorial(int valor){
        int resultado = 1;     
    
        for( int i=valor; i>0; i--){
            resultado *= i;
        }
        return resultado;
    } 

}

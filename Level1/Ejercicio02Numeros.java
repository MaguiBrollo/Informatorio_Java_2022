package Level1;

import java.util.Scanner;

public class Ejercicio02Numeros {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("------CALCULAR OPERACIONES-----");
        
        System.out.print("Ingrese el primer número: ");
        var numero1 = scan.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scan.nextInt();
        
        int suma =  numero1 + numero2;
        System.out.println("La suma es: " + suma);

        int difercia =  numero1 - numero2;
        System.out.println("La diferencia es: " + difercia);

        int producto =  numero1 * numero2;
        System.out.println("El producto es: " + producto);

        if (numero2 !=0 && (numero1>=numero2)) {
            int cociente =  numero1 / numero2;
            System.out.println("El cociente es: " + cociente);

            int modulo =  numero1 % numero2;
            System.out.println("El módulo es: " + modulo);
        }else{
            System.out.println("\nNo es posible calcular el cociente, ni el módulo.");
            System.out.println("El 2do número, debe ser mayor que cero. \nEl 1er número debe ser mayor o igual que el 2do número.");
        }
        System.out.println("-------------------------------");
        scan.close();
    }
}

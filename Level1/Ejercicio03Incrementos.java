package Level1;

import java.util.Scanner;

public class Ejercicio03Incrementos {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("------INCREMENTOS--------------");
        System.out.print("Ingrese el número: ");
        var numero = scan.nextInt();

        if (numero>0){
            for(int i = 1; i <= numero; i++){
                for(int j = 1; j <= numero - (numero - i) ; j++){
                    System.out.print(" "+j);
                }
                System.out.println("");
            }
        }else{
            System.out.println("El numero debe ser entero y mayor que cero.");
        }
        System.out.println("-------------------------------");
        scan.close();
    }
}

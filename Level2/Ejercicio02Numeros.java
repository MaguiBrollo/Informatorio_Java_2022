package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2.	Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al 
principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista
 y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
*/

public class Ejercicio02Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros =new ArrayList<>();
        
        int num;
        for(int i=0; i<5; i++){
            System.out.print("Ingrese el Número "+(i+1)+ ": ");
            num = scan.nextInt();   

            numeros.add(num);
        }

        mostrarListaConTamanio(numeros); 

        //agregar un numero al ppio
        System.out.print("Ingrese el PRIMER Número: ");
        num = scan.nextInt();  
        numeros.add(0, num);

        System.out.print("Ingrese el ULTIMO Número: ");
        num = scan.nextInt();  
        numeros.add(numeros.size(), num);

        mostrarListaConTamanio(numeros);
    
        System.out.println("-----------------------------------");
        scan.close();
    }

    private static void mostrarListaConTamanio(List<Integer> numeros) {
         //iterar y mostrar
         int i = 0;
         for(Integer xn: numeros){
             i++;
             System.out.println("#" + i + " " + xn);
        }
        System.out.println("Tamaño de la lista: "+ numeros.size());
    }    

}

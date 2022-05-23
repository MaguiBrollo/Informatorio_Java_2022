package Level2;

import java.util.Scanner;

public class Ejercicio07Multiplos {
    public static void main(String[] args) {
        int inicio = 0;
        int fin = 0 ;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el PRIMER Número: ");
        inicio = scan.nextInt();  
        
        System.out.print("Ingrese el ULTIMO Número: ");
        fin = scan.nextInt();  

        scan.close();
        
        if (inicio < fin ){
               //continua
            int i=0;
            int cantidad = Math.abs(fin-inicio);
            String[]  multiplos = new String[cantidad];

            multiplos = cargarArray(inicio,fin);
           
            System.out.print("\n[");  
            for (String mul: multiplos) {
                System.out.print(mul);  
                
                if ((i+1) < Math.abs(fin-inicio)){
                    System.out.print(", ");
                }
                i++;
            } 
            System.out.print("]\n"); 
            System.out.println();

        }else{
            //fin 
            System.out.println("\nEl primer numero debe ser menor al segundo (ej 1,4)\n");
        }
    }

    private static String[] cargarArray(int inicio, int fin) {
        String res = "";
        int index = -1;
        Integer cantidad = Math.abs(fin-inicio);
        String multi[]= new String[cantidad];
        
        for (int i = inicio; i < fin; i++){
            
            if (i % 2 == 0 && i % 3 == 0) 
                res = "FizzBuzz"; 
            else
                if (i % 2 == 0) 
                    res = "Fizz"; 
                else
                    if (i % 3 == 0) 
                        res = "Buzz";
                    else
                        res = String.valueOf(i);
            index++;       
            multi[index] = res;
        }
        return multi;
    }

}

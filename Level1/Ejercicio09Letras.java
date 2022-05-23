package Level1;

import java.util.Scanner;

/*
9.	Dado un String de entrada (frase, texto, etc) calcular la cantidad de
   veces que aparece una letra dada
*/
public class Ejercicio09Letras {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("------Contando letras--------------");
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Ingrese una Frase............: ");
            String frase = scan.nextLine();

            System.out.print("Ingrese una letra a buscar...: ");
            char letra = scan.next().charAt(0);

            System.out.println("Cantidad de aparcicones de ("+ letra +") en la frase es: "+ contar(frase,letra));
            System.out.println("-----------------------------------");
            scan.close();
        }
    }

    private static int contar(String frase, char letra) {
        int cantidad=0;
        frase = frase.toUpperCase();
        
        for(int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == Character.toUpperCase(letra))
                cantidad++;
        }
        return cantidad;
    }
}

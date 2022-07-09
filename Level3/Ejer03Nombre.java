import java.util.List;
import java.util.Scanner;

public class Ejer03Nombre {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        List<String> palabras = List.of("Batman", "Aquaman", "bFlash", "Batgirl", "Wonder Woman", "brainiac");
        String letraBuscada;
        //int contador=0;

        //iterar y mostrar
        System.out.println("\n------------------\nLas palabras son: ");
        palabras.stream().forEach(System.out::println);
        
        System.out.print("\nIngrese una letra para buscar: ");
        letraBuscada = scan.nextLine();
               
        System.out.print("\nCantidad de palabras que empiezan con "+letraBuscada+" son: ");
        System.out.println(palabras.stream().
            filter(pal->pal.toUpperCase().charAt(0) == letraBuscada.toUpperCase().charAt(0)).count());
        
        System.out.println("-----------------------------------");
        scan.close();
    }
}

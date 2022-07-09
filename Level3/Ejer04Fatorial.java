import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejer04Fatorial {
    
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4, 5, 6, 6);
        
        List<Integer> numero2 = numeros.stream().distinct().collect(Collectors.toList());

        Map<Integer, Integer> factorial = new HashMap<>();
       
        System.out.println("\nLos numeros repetidos: ");
        numeros.stream().forEach(System.out::println);
              
        System.out.println("\nLos numeros sin repetir: ");
        numero2.stream().forEach(System.out::println);
       
        numero2.stream().forEach(num -> factorial.put(num, factorial(num)));
        
        System.out.println("\n   Número - Factorial: ");
        List<String> mensajes = factorial.entrySet().stream()
            .map(x->"Numero: "+ x.getKey() +" - Factorial: " + x.getValue())
            .collect(Collectors.toList());     
        mensajes.stream().forEach(System.out::println);

        System.out.println("--------------------------------\n");
    }

    //-----------------------------------------------------
    public static int factorial(int valor){
        int resultado = 1;     
    
        for( int i=valor; i>0; i--){
            resultado *= i;
        }
        return resultado;
    } 
    
}

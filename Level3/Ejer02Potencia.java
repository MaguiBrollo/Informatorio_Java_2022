import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejer02Potencia {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        Map<Integer, Integer> potencias =  cargarMap(numeros);

        System.out.println("\nLas potencias son: ");
        mostrarMap(potencias);
        System.out.println("\n--------------------- ");
    }

    public static  Map<Integer, Integer> cargarMap(List<Integer> numeros){
        Map<Integer, Integer> potencias = new HashMap<>();
        numeros.stream().forEach(num -> potencias.put(num, num*num));
        return potencias;
    }  

    private static void mostrarMap(Map<Integer, Integer> potencias) {
        List<String> mensajes = potencias.entrySet().stream()
            .map(x->"Numero: "+ x.getKey() +" - Potencia de 2 es: " + x.getValue())
            .collect(Collectors.toList());     
        mensajes.stream().forEach(System.out::println);
    }
}

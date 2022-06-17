
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejer02Potencia {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        Map<Integer, Integer> potencias =  cargarMap(numeros);


        //Mostrar el MAP
        System.out.println("Las potencias son: ");
        mostrarMap(potencias);
    }

    private static void mostrarMap(Map<Integer, Integer> potencias) {
        for(Map.Entry<Integer,Integer> registro: potencias.entrySet()){
            System.out.println("Número: "+registro.getKey()+" - Potencia de 2: "+ registro.getValue());
        }  
    }

    public static  Map<Integer, Integer> cargarMap(List<Integer> numeros){
        Map<Integer, Integer> potencias = new HashMap<>();
        for(Integer num: numeros){
            potencias.put(num, num*num);
        }
        return potencias;
    }  
}

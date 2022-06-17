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
        for(Integer num: numeros){
            System.out.println(num);
        }
               
        System.out.println("\nLos numeros sin repetir: ");
        for(Integer num: numero2){
            System.out.println(num);
        }

        for(Integer num: numero2){
            factorial.put(num, factorial(num));
        }

        //iterar y mostrar clave valor
        System.out.println("\n  Número - Factorial: ");
        for(Map.Entry<Integer,Integer> reg: factorial.entrySet()){
            System.out.println("      "+reg.getKey()+"  -  "+ reg.getValue());
        }
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

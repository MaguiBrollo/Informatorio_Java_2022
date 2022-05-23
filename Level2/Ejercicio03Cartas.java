package Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio03Cartas {
    
    public static void main(String[] args) {
        List<String> cartas = new ArrayList<>(); 

        cargarLista(cartas);
        
        imprimirLista(cartas, "LISTA" ); // orden ascendente
       
        Collections.reverse(cartas);
        imprimirLista(cartas, "Lista REVERSA");

        Collections.shuffle(cartas);
      
        imprimirLista(cartas, "Lista DESORDENADA");

        Collections.sort(cartas);
        imprimirLista(cartas,"Lista ORDENADA");

    }

    //imprimir
    private static void imprimirLista(List<String> cartas, String mensaje) {
        int i=0;
        System.out.println("\n.............."+ mensaje+"...............");
        for(String car: cartas){
            i++;
            System.out.println("Carta" + i + " -> " + car);
        }
    }

    //cargar lista
    private static void cargarLista(List<String> cartas) {
        cartas.add(" 1");
        cartas.add(" 2");
        cartas.add(" 3");
        cartas.add(" 4");
        cartas.add(" 5");
        cartas.add(" 6");
        cartas.add(" 7");
        cartas.add(" 8");
        cartas.add(" 9");
        cartas.add("10");
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
    }
}

package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio05Horas {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista3 = new ArrayList<>();
        Integer total = 0;

        cargarLista(lista1, lista2);
        total = calcularCobro(lista1, lista2, lista3);

        System.out.println("Cobros:" + lista3);
        System.out.println("Total Final $: " + total + "\n");        
    }

    private static int calcularCobro(List<Integer> lista1, List<Integer> lista2, List<Integer> lista3) {
        int i = 0;
        Integer resultado = 0;
        Integer total = 0;

        for( Integer hs: lista1){
            resultado = hs * lista2.get(i);
            i++;
            total += resultado;
            lista3.add(resultado);
        }
        return total;
    }

    private static void cargarLista(List<Integer> lista11, List<Integer> lista22){
        Scanner scan = new Scanner(System.in);
        int horas = 0;
        int valor = 0;

        System.out.println("\nIngrese Horas y Valor por Hora. Para salir HORA=0 (cero) : ");
        do{
            System.out.print("Ingrese Horas Trabajadas...: ");
            horas = scan.nextInt();

            if (horas !=0 ){
                lista11.add(horas);

                System.out.print("Ingrese Valor-Hora.........: ");
                valor = scan.nextInt();
                lista22.add(valor);
            }else{
                System.out.println("\nFIN DE LA CARGA.\n");
            }
        }while(horas != 0);
        scan.close();
    }
}

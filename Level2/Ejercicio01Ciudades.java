package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1.	Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
    luego imprimir por pantalla el ranking
*/
public class Ejercicio01Ciudades {
    public static void main(String[] args) {
        List<String> ciudades =new ArrayList<>();

        //carga la lista y muestra el tamaño
        System.out.println("-----------------------------------");
        System.out.println("-------CIUDADES FAVORITAS----------");
       
        cargarLista(ciudades);
        
        System.out.println("Tamaño de la lista luego de la carga: "+ ciudades.size());

        //iterar y mostrar
        int i = 0;
        for(String ciud: ciudades){
            i++;
            System.out.println("#" + i + " " + ciud);
        }
        System.out.println("-----------------------------------");
    }

    //metodo
    public static void cargarLista(List<String> ciudades){
        try (Scanner scan = new Scanner(System.in)) {
            String ciudadFav ="";
            do{
                System.out.print("Ingrese el nombre de una ciudad (X=salir)......: ");
                ciudadFav = scan.nextLine();
                ciudadFav = ciudadFav.toUpperCase();

                if(!ciudadFav.equals("X")){
                    ciudades.add(ciudadFav);
                }else{
                    System.out.print("Salida.... ");
                }
            }while (!ciudadFav.equals("X"));
            scan.close();
        }
        
    }    
}

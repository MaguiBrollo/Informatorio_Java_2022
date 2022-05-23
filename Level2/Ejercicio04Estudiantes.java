package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio04Estudiantes {
    public static void main(String[] args) {
                
        List<String> estudiantes =  new ArrayList<>();
        List<String> estudiantes1 =  new ArrayList<>();
        List<String> estudiantes2 =  new ArrayList<>();
        List<String> estudiantes3 =  new ArrayList<>();

        cargarLista(estudiantes);
        estudiantes1 =estudiantes.subList(0, 4);
        System.out.println("\nlista 1 ->" + estudiantes1);

        estudiantes2 =estudiantes.subList(4, 8);
        System.out.println("lista 2 ->" + estudiantes2);

        estudiantes3 =estudiantes.subList(8, 12);
        System.out.println("lista 3 ->" + estudiantes3+"\n");
    }

    private static void cargarLista(List<String> estudiantes) {
        estudiantes.add("María");
        estudiantes.add("Ana");
        estudiantes.add("José");
        estudiantes.add("Lolo");

        estudiantes.add("Pedro");
        estudiantes.add("Rocío");
        estudiantes.add("Manuel");
        estudiantes.add("Eduardo");
        
        estudiantes.add("Claudio");
        estudiantes.add("Norma");
        estudiantes.add("Paulo");
        estudiantes.add("Martín");
    }
}

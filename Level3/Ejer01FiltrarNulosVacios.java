import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejer01FiltrarNulosVacios {
    public static void main(String[] args) {

        List<String> listaEntrada =new ArrayList<>();
        listaEntrada = new ArrayList<>();

        listaEntrada.add("Hola");
        listaEntrada.add(null);   //elemento nulo
        listaEntrada.add("Informatorio");
        listaEntrada.add("");     //elemento vacío
        //listaEntrada.add("    ");     //elemento con espacio


        System.out.println("\n-------------------------------\nLISTA COMPLETA: ");
        for(String ent: listaEntrada){               //iterar y mostrar
            System.out.println(ent);
        }

        limpiarNuloEspacios(listaEntrada);
        System.out.println("\nLista limpia de nulos: ");
        for(String ent: listaEntrada){               //iterar y mostrar
            System.out.println(ent);
        }

        limpiarNuloEspacios(listaEntrada);
        System.out.println("\nLista limpia de nulos y espacios con Steams: ");
        for(String ent: listaEntrada){               //iterar y mostrar
            System.out.println(ent);
        }

        System.out.println("\n--------------------- ");
    }

    public static List<String> limpiarNuloEspacios(List<String> listaString) {
        for(int i = 0; i < listaString.size(); i++){
            if (listaString.get(i) == null || listaString.get(i).trim().isEmpty() ) {
                listaString.remove(i);
            }
        }
        return listaString;
    }

    public static  List<String> limpiarNuloEspaciosConStreams(List<String> listaString) {
        return listaString.stream()
                .filter(elemento -> Objects.nonNull(elemento))   //.filter(elemento -> elemento != null)
                .filter(elemento -> isNotEmpty(elemento))  //metodo creado por nos
                .collect(Collectors.toList());
        // se puso en el return todo el proceso, y eso se llama retorno en linea
    }

    private static boolean isNotEmpty(String valor){
        return !valor.trim().isEmpty();
    }
}

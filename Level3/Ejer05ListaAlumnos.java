import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejer05ListaAlumnos {
    
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Alumno> alumnos = new ArrayList<>();
           
        cargarLista(alumnos,fmt);

        Map<String, Integer> alumnosMap = generarMap(alumnos);

        System.out.println("\n       Alumno - Edad  ");
        mostrarMapAlumnos(alumnosMap);

        System.out.println("--------------------------------\n");
    }

    private static void mostrarMapAlumnos(Map<String, Integer> alumnosMap) {
        List<String> mensajes = alumnosMap.entrySet().stream()
            .map(x->"        "+ x.getKey() +" - " + x.getValue())
            .collect(Collectors.toList());     
        mensajes.stream().forEach(System.out::println);
    }

    private static Map<String, Integer> generarMap(List<Alumno> alumnos) {
        Map<String, Integer> mapAlum = new HashMap<>();
        alumnos.stream()
            .forEach(x -> mapAlum.put( x.getApellido()+", "+x.getNombre() , 
                                  Period.between(x.getFechaNac(), LocalDate.now()).getYears() ));
        return mapAlum;
    }

    private static void cargarLista(List<Alumno> alumnos, DateTimeFormatter fmt) {
        alumnos.add(new Alumno("Homero", "Simpson", LocalDate.parse("15/08/1993", fmt) ));
        alumnos.add(new Alumno("Magui", "Brollo", LocalDate.parse("09/02/1975", fmt) ));
        alumnos.add(new Alumno("Miguel", "Duda", LocalDate.parse("01/03/1972", fmt) ));
        alumnos.add(new Alumno("Darla", "Nara", LocalDate.parse("11/03/2003", fmt) ));
        alumnos.add(new Alumno("Sacha", "Bro", LocalDate.parse("27/04/1998", fmt) ));
    }
       

}

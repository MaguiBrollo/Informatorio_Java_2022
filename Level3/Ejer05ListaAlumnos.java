import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejer05ListaAlumnos {
    
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Alumno> alumnos = new ArrayList<>();
           
        cargarLista(alumnos,fmt);

        Map<String, Integer> alumnosMap = generarMap(alumnos);

        mostrarMapAlumnos(alumnosMap);
    }

    private static void mostrarMapAlumnos(Map<String, Integer> alumnosMap) {
        //iterar y mostrar clave valor
        System.out.println("\n  Alumno          - Edad  ");
        for(Map.Entry<String, Integer> reg: alumnosMap.entrySet()){
            System.out.println("      "+reg.getKey()+"  -  "+ reg.getValue());
        }
    }

    private static Map<String, Integer> generarMap(List<Alumno> alumnos) {
        Map<String, Integer> mapAlum = new HashMap<>();
        for (Alumno alumno : alumnos) {
            Period anios = Period.between(alumno.getFechaNac(), LocalDate.now());
            mapAlum.put(alumno.getApellido()+" "+alumno.getNombre(), anios.getYears());
        }
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

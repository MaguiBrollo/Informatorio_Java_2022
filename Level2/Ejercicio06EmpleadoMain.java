package Level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio06EmpleadoMain {
    public static void main(String[] args) {
        Set<Empleado> empleados =new HashSet<>();
        Map<Integer, Integer> sueldoEmpleados = new HashMap<>();

        System.out.println(" SET una coleción no ordenada. ");
        //carga la lista y muestra el tamaño
       
        cargarLista(empleados);
        System.out.println("Tamaño del SET luego de la carga: "+ empleados.size());

        calcularSueldo(empleados,sueldoEmpleados);

        mostrarSueldoEmpleado(sueldoEmpleados);

        System.out.println("\n...");

    }

    private static void mostrarSueldoEmpleado(Map<Integer, Integer> sueldoEmpleados) {
        System.out.println("\nDNI          - Sueldos");
         //iterar y mostrar clave valor
         for(Map.Entry<Integer,Integer> registro: sueldoEmpleados.entrySet()){
            System.out.println(String.format("%12s - %10s",registro.getKey(),registro.getValue()));
        }
    }

    //funciones --------------------------------------------------------------------
    private static void calcularSueldo(Set<Empleado> empleados, Map<Integer, Integer> sueldoEmpleados) {
        int sueldo = 0;
        System.out.println("\nSueldos por Empleado...");

        for(Empleado emple:empleados){
            sueldo = emple.horasTrabajadas * emple.valorPorHora;
            sueldoEmpleados.put(emple.dni, sueldo);
            System.out.println(String.format("Empleado: %-25s - Sueldo: $ %s ", (emple.apellido+", "+emple.nombre),sueldo));

        }
    }

    public static void cargarLista(Set<Empleado> empleados){
        Scanner scan = new Scanner(System.in);
        Empleado emple;
        
        String xNombre = "";
        String xApellido = "";
        int xDni = 0;
        int xHorasTrabajadas = 0;
        int xValorPorHora = 0 ;
        String seguir;

        System.out.println("\nIngrese los datos del Empleado...");
        do{
            System.out.print("Nombre...: ");
            xNombre = scan.nextLine();

            System.out.print("Apellido..: ");
            xApellido = scan.nextLine();

            System.out.print("Nro DNI...: ");
            xDni = scan.nextInt();
            //scan.nextLine();//Limpiamos buffer de entrada
            
            System.out.print("Hs Trabajadas....: ");
            xHorasTrabajadas = scan.nextInt();

            System.out.print("Valor por Hora...: ");
            xValorPorHora = scan.nextInt();

            emple = new Empleado(xNombre, xApellido,xDni, xHorasTrabajadas,xValorPorHora);
            empleados.add(emple);

            System.out.print("Continuar la carga S/N? ");
            seguir = scan.next();
            seguir = seguir.toUpperCase();
            scan.nextLine();//Limpiamos buffer de entrada

        }while (seguir.equals("S"));
        scan.close();
    }
}

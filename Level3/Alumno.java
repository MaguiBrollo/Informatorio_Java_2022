import java.time.LocalDate;

public class Alumno {
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    
    public Alumno(String apellido, String nombre, LocalDate fechaNac) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Ejer05Alumnos [apellido=" + apellido + ", fechaNac=" + fechaNac + ", nombre=" + nombre + "]";
    }
}

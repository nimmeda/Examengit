package Clases;
    /**
 *
 * @author jmedi
 * @version 1.0.0
 * @since 0.0.0
 * 
 */
import java.time.LocalDate;
 
public class Alumno extends Persona{

    private LocalDate fechaMatriculacion;
    private String nacionalidad;
    
    public Alumno(int DNI, String nombre, LocalDate fechaMatriculacion, String nacionalidad){
        super(DNI, nombre);
        this.fechaMatriculacion = fechaMatriculacion;
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "fechaMatriculacion=" + fechaMatriculacion + ", nacionalidad=" + nacionalidad + '}';
    }
    
}

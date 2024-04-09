package Clases;
    /**
 *
 * @author jmedi
 * @version 1.0.0
 * @since 0.0.0
 * 
 */
public class Profesor extends Persona {

    private String departamento;
    
    public Profesor(int DNI, String nombre, String departamento){
        super(DNI, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  "Profesor{" + "departamento=" + departamento + '}';
    }
}

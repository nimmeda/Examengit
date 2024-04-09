package Clases;

import java.util.ArrayList;
    /**
 *
 * @author jmedi
 * @version 1.0.0
 * @since 0.0.0
 * 
 */

public class Asignatura {

    private int codigo;
    private String nombre;
    private int Horas_anuales;
    private ArrayList<String> Lista_alumnos;
    
    public Asignatura(int codigo, String nombre, int Horas_anuales, ArrayList Lista_alumnos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.Horas_anuales = Horas_anuales;
        this.Lista_alumnos = Lista_alumnos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras_anuales() {
        return Horas_anuales;
    }

    public void setHoras_anuales(int Horas_anuales) {
        this.Horas_anuales = Horas_anuales;
    }

    public ArrayList<String> getLista_alumnos() {
        return Lista_alumnos;
    }

    public void setLista_alumnos(ArrayList<String> Lista_alumnos) {
        this.Lista_alumnos = Lista_alumnos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", Horas_anuales=" + Horas_anuales + ", Lista_alumnos=" + Lista_alumnos + '}';
    }
    
    
    
}

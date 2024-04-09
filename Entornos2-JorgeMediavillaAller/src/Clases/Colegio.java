package Clases;

import java.util.ArrayList;
import Clases.Persona;
import Clases.Asignatura;
import Clases.Alumno;
import Clases.Profesor;

public class Colegio {
    /**
 * Nos permite almacenar todos los datos del colegio
 * @author jmedi
 * @version 1.0.0
 * @since 0.0.0
 * 
 */
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Persona> Personas;
    
    public Colegio(ArrayList asignaturas, ArrayList Personas){
        this.Personas = Personas;
        this.asignaturas = asignaturas;
    }

    public static void GuardaDatos(ArrayList asignaturas, ArrayList<Persona> Alumno, ArrayList<Persona> Profesor){
        /**
         * Nos permite guardar datos
         * @return guarda los datos asignados
         */
    }
    public static void CargarDatos(){
        /**
         * @param CargarDatos
         * @return guarda los datos asignados
         */
    }
    public static void listarAlumno(ArrayList<Persona> Alumno){
        /**
         * @param listarAlumno
         * @return Nos lista los Alumnos
         */
    }
    public static void ListarProfesor(ArrayList<Persona> Profesor){
        /**
         * @param ListarProfesor
         * @return Nos lista los profesores
         */
    }
    
    public void AltaProfesor(ArrayList<Persona> Profesor){
        /**
         * @param AltaProfesor
         * @return Da de alta Profesores
         */
    }
    public void AltaAlmno(ArrayList<Persona> Alumno){
        /**
         * @param AltaAlmno
         * @return Da de alta alumnos
         */
    }
    public void AltaAsignatura(int codigo, String nombre, int horas, int DNI){
        /**
         * @param AltaAsignatura
         * @return da de alta asignaturas
         */
    }
    
    public void MatriculaAlumnoAsignatura(){
        /**
         * @param MatriculaAlumnoAsignatura
         * @return nos  deja matricular alumnos a asignaturas
         */
    }
    
    public void CantidadAsignaturas(int Cantidad){
        /**
         * @param CantidadAsignaturas
         * @return nos dice la cantiadad de asignaturas que hay
         */
    }
    
    public void MasMatriculados(){
        /**
         * @param MasMatriculados
         * @return nos dice que asginatura es la que mas gente apuntada tiene
         */
    }

    @Override
    public String toString() {
        return "Colegio{" + "asignaturas=" + asignaturas + ", Personas=" + Personas + '}';
    }
}

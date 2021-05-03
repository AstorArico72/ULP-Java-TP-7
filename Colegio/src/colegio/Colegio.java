package colegio;
import colegio.vista.*;
import java.util.HashSet;

public class Colegio {

    /**
     * @param args la lógica del Main va ahí.
     * ¿Por qué el main pide un arreglo de String llamado "args"?
     */
    public static void main(String[] args) {
        /**
         * Es obligatorio instanciar un colegio, e añadirle un estudiante al HashSet de estudiantes.
         * También es obligatorio instanciar una materia y colocarla en el HashSet de materias.
         * (5/3 3:33 PM) YA NO.
         */
        
        Colegio c0 = new Colegio ();
       
        FrameColegio fc0 = new FrameColegio (c0);
        fc0.main (c0, args);
    }
    
    public HashSet <Alumno> estudiantes = new HashSet ();
    public HashSet <Materia> materias = new HashSet ();
}
package colegio;
import java.util.HashSet;
import java.util.Iterator;

public class Alumno {
    private String primerNombre;
    private String nombre;
    private int legajo;
    public HashSet <Materia> listaMaterias = new HashSet (); //Un HashSet sirve, creo.
    
    /*
    Si uso Map, tendría que poner el ID de la materia como llave.
    Y el ID de la materia está en el constructor de la clase Materia...
    Así que, un Set sirve mejor para ésto.
    Específicamente un HashSet, que evita duplicados usando códigos de hash.
    */
    
    public Alumno (String fn, String n, int l) { //Dicho int debería ser un código o algo así...
        this.primerNombre = fn;
        this.nombre = n;
        this.legajo = l;
    }
    
    public String getNombre () { //Sí, usé un solo método para retornar éso.
        return primerNombre + " " + nombre;
    }
    
    public void renombrar (String fn, String n) {
        this.primerNombre = fn;
        this.nombre = n;
    }
    
    public void agregarMateria (Materia m) {
        listaMaterias.add (m);
    }
    
    public int cantidadMaterias () {
        return listaMaterias.size();
    }
    
    public String getMaterias () {
        String s0 = "";
        Iterator <Materia> i0 = listaMaterias.iterator();
        while (i0.hasNext()) {
            s0 += i0.next().getNombre();
            s0 += "; ";
        }
        return s0;
    }
    
    public int getLegajo () {
        return this.legajo;
    }
    
    public void cambiarLegajo (int l) {
        this.legajo = l;
    }
    
    @Override
    public String toString () {
        return this.getNombre() + " (#" + this.legajo + ")";
    }
}
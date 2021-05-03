package colegio;

public class Materia {
    private int idMateria;
    private String nombre;
    private int año;
    
    public Materia (int id, String n, int a) {
        this.año = a;
        this.idMateria = id;
        this.nombre = n;
    }
    
    public int getID () {
        return idMateria;
    }
    
    public String getNombre () {
        return nombre;
    }
    
    public int getAño () {
        return año; //PUEDO USAR LA Ñ EN EL CÓDIGO! GRACIAS UTF-8!
    }
    
    public void cambiarID (int id) {
        this.idMateria = id;
    }
    
    public void renombrar (String n) {
        this.nombre = n;
    }
    
    public void cambiarAño (int a) {
        this.año = a;
    }
    
    @Override
    public String toString () {
        return this.getNombre();
    }
}

package directorio;

public class Cliente {
    private String primerNombre;
    private String nombre;
    private String ciudad;
    private String dni;
    
    public Cliente (String fn, String n, String c, String d) {
        this.primerNombre = fn; //Primer nombre, input0
        this.nombre = n; //Nombre, input1
        this.ciudad = c; //Ciudad, input2
        this.dni = d; //DNI, input3
    }
    
    public String getNombre () {
        String n0 = this.primerNombre;
        String n1 = this.nombre;
        return n0 + " " + n1;
    }
    
    public String getdni () {
        return this.dni;
    }
    
    public String getCiudad () {
        return this.ciudad;
    }
    
    public String getApellido () {
        return this.nombre;
    }
}
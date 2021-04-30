package directorio;
import directorio.vista.PaginasAmarillas;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;

public class Directorio {
    /*
    * @param args la línea de comandos...
    */
    public static void main(String[] args) {
        Directorio d0 = new Directorio ();
        PaginasAmarillas p0 = new PaginasAmarillas (d0);
        p0.main (args, d0);
    }
    
    private HashMap <String, Cliente> lista = new HashMap <> (); //Ése String es el número de teléfono.
    
    public boolean agregarCliente (String tel, Cliente abonado) { //Ése String es NInput0.
        Set clientSet = lista.keySet();
        if (clientSet.contains(abonado)) {
            System.out.println ("Entrada inválida");
            return true;
        }
        else {
            lista.put (tel, abonado);
            System.out.println ("Agregado cliente: " + abonado + "Número: " + tel + "Ciudad:" + abonado.getCiudad());
            System.out.println (lista);
            return false;
            }
        }
    
    public boolean borrarCliente (String dni) {
        Set clientSet = lista.keySet ();
        Iterator <String> clientIterator = clientSet.iterator ();
        while (clientIterator.hasNext ()) {
            String num = (String) clientIterator.next ();
            Cliente c0 = lista.get (num);
            
            if (c0.getdni().equals (dni)) {
                lista.remove(num);
                return true;
            }
        }
        System.out.println ("Cliente borrado.");
        return false;
    }
    
    public String buscarCliente (String telefono) {
        Cliente c0 =lista.get(telefono);
        return c0.getNombre();
    }
    
    public String buscarClientes (String ciudad) {
        Set clientSet = lista.keySet ();
        Iterator <String> clientIterator = clientSet.iterator ();
        String s0 = "";
        
        while (clientIterator.hasNext ()) {
            String num = (String) clientIterator.next ();
            Cliente c0 = lista.get (num);
            
            if (c0.getCiudad().equals (ciudad)) {
                s0 += c0.getNombre ();
                s0 += "; ";
            }
        }
        return s0;
    }
    
    //buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de teléfono asociados a dicho apellido.
    public ArrayList buscarTelefono (String apellido) {
        ArrayList <String> s0 = new ArrayList ();
        Set clientSet = lista.keySet ();
        Iterator <String> clientIterator = clientSet.iterator ();
        
        while (clientIterator.hasNext ()) {
            String num = (String) clientIterator.next ();
            Cliente c0 = lista.get (num);
            
            if (c0.getApellido ().equals (apellido)) {
                s0.add (num);
            }
        }
        return s0;
    }
    
}
package logica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class DirectorioTelefonico {

    private TreeMap<Long, Contacto> ListaContactos;

    public DirectorioTelefonico() {
        ListaContactos = new TreeMap<>();
    }

    // Agregar contacto 
    public void agregarContacto(Long telefono, Contacto contacto) {
        if (!ListaContactos.containsKey(telefono)) {
            ListaContactos.put(telefono, contacto);
        } else {
            System.out.println("El teléfono ya existe en el directorio.");
        }
    }

    // Buscar contacto por tel
    public Contacto buscarContacto(Long telefono) {
        if (ListaContactos.containsKey(telefono)) {
            return ListaContactos.get(telefono);
        } else {
            return null;
        }
    }

    // Buscar telefonos por apellido
    public HashSet<Long> buscarTelefono(String apellido) {
        HashSet<Long> listaTelefonos = new HashSet<>();

        for (Map.Entry<Long, Contacto> contactoEntry : ListaContactos.entrySet()) {
            Contacto c = contactoEntry.getValue();
            if (c.getApellido().equals(apellido) && ListaContactos.containsValue(c)) {
                listaTelefonos.add(contactoEntry.getKey());
            }
        }
        return listaTelefonos;
    }

    // Buscar contactos por ciudad
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactosPorCiudad = new ArrayList<>();

        for (Map.Entry<Long, Contacto> contactoEntry : ListaContactos.entrySet()) {
            Contacto c = contactoEntry.getValue();
            if (c.getCiudad().equals(ciudad) && ListaContactos.containsValue(c)) {
                contactosPorCiudad.add(c);
            }
        }

        return contactosPorCiudad;
    }

    // Borrar contacto
    public void borrarContacto(Long telefonoABorrar) {
        if (ListaContactos.containsKey(telefonoABorrar)) {
            ListaContactos.remove(telefonoABorrar);
        } else {
            System.out.println("El teléfono no existe en el directorio.");
        }
    }

    //Constructor
    public DirectorioTelefonico(TreeMap<Long, Contacto> ListaContactos) {
        this.ListaContactos = ListaContactos;
    }

    //Getter
    public TreeMap<Long, Contacto> getListaContactos() {
        return ListaContactos;
    }

    //Setter
    public void setListaContactos(TreeMap<Long, Contacto> ListaContactos) {
        this.ListaContactos = ListaContactos;
    }
    
    
}


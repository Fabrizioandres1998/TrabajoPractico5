package main;

import logica.Contacto;
import logica.DirectorioTelefonico;
import vista.frmMenuPrincipal;

public class Main {

    public static void main(String[] args) {

        frmMenuPrincipal menuPrincipal = new frmMenuPrincipal(); //Instancia del jframe
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);

//        DirectorioTelefonico directorio = new DirectorioTelefonico();
//
//        //Crear contactos
//        Contacto c1 = new Contacto("12345678", "Juan", "Pérez", "Buenos Aires", "Calle Falsa 123");
//        Contacto c2 = new Contacto("87654321", "Ana", "Gómez", "Córdoba", "Av. Siempre Viva 742");
//        Contacto c3 = new Contacto("45678912", "Luis", "Pérez", "Buenos Aires", "Mitre 500");
//        Contacto c4 = new Contacto("65432198", "Carla", "López", "Rosario", "San Martín 999");
//
//        //Agregar contactos
//        directorio.agregarContacto(1122334455L, c1);
//        directorio.agregarContacto(1199887766L, c2);
//        directorio.agregarContacto(1133445566L, c3);
//        directorio.agregarContacto(1177665544L, c4);
//
//        //Buscar contacto por telefono
//        System.out.println("Buscar contacto por tel 1122334455:");
//        System.out.println(directorio.buscarContacto(1122334455L));
//
//        //Buscar telefonos por apellido
//        System.out.println("Buscar teléfonos por apellido 'Pérez':");
//        System.out.println(directorio.buscarTelefono("Pérez"));
//
//        //Buscar contactos por ciudad
//        System.out.println("Buscar contactos de Buenos Aires:");
//        for (Contacto c : directorio.buscarContactos("Buenos Aires")) {
//            System.out.println(c);
//        }
//
//        //Borrar contacto
//        System.out.println("Borrar contacto con tel 1177665544:");
//        directorio.borrarContacto(1177665544L);
//        System.out.println("Directorio después de borrar:");
//        System.out.println(directorio.getListaContactos());
    }

}

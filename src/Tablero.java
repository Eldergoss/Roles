

import java.util.ArrayList;

public class Tablero {

    // Atributos
    private ArrayList<String> usuarios;

    // Constructor
    public Tablero() {
        this.usuarios = new ArrayList<>();
    }

    // Métodos
    public void agregarUsuario(User usuario, String nombre) {

        if (usuario.rol.equals("ADMIN") || usuario.rol.equals("SUPERADMIN")) {

            usuarios.add(nombre);
            System.out.println("Usuario agregado.");

        } else {

            System.out.println("Acceso denegado.");

        }
    }

    public void verUsuarios(User usuario) {

        if (usuario.rol.equals("ADMIN") || usuario.rol.equals("SUPERADMIN")) {

            for (String nombre : usuarios) {
                System.out.println(nombre);
            }

        } else {

            System.out.println("Acceso denegado.");

        }
    }

    public void eliminarUsuario(User usuario, String nombre) {

        if (usuario.rol.equals("ADMIN") || usuario.rol.equals("SUPERADMIN")) {

            usuarios.remove(nombre);
            System.out.println("Usuario eliminado.");

        } else {

            System.out.println("Acceso denegado.");

        }
    }

}

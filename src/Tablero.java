import java.util.ArrayList;

public class Tablero {

    // Atributos
    private ArrayList<User> usuarios;
    private ArrayList<User> admins;

    // Constructor
    public Tablero() {
        this.usuarios = new ArrayList<>();
        this.admins = new ArrayList<>();
    }

    // Agregar usuario
    public void agregarUsuario(User admin, User nuevoUsuario) {

        if (admin.rol.equals("ADMIN") || admin.rol.equals("SUPERADMIN")) {

            usuarios.add(nuevoUsuario);
            System.out.println("Usuario agregado." + nuevoUsuario);

        } else {

            System.out.println("Acceso denegado.");

        }
    }

    // Ver usuarios
    public void verUsuarios(User usuario) {

        if (usuario.rol.equals("ADMIN") || usuario.rol.equals("SUPERADMIN")) {

            System.out.println("=== Lista de Usuarios ===");

            for (User usuarioLista : usuarios) {
                System.out.println(usuarioLista.nombre);
            }

        } else {

            System.out.println("Acceso denegado.");

        }
    }

    // Eliminar usuario
    public void eliminarUsuario(User admin, User nuevoUsuario) {

        if (admin.rol.equals("ADMIN") || admin.rol.equals("SUPERADMIN")) {

            usuarios.remove(nuevoUsuario);
            System.out.println("Usuario eliminado." + nuevoUsuario.nombre);

        } else {

            System.out.println("Acceso denegado.");

        }
    }

    // Promover a administrador
    public void promoverAdmin(User admin, User nuevoUsuario) {

        if (admin.rol.equals("SUPERADMIN")) {

            // Primero eliminamos al usuario
            usuarios.remove(nuevoUsuario);

            // Luego lo agregamos como administrador
            admins.add(nuevoUsuario);

            System.out.println("Usuario promovido a Admin." + nuevoUsuario.nombre);

        } else {

            System.out.println("Acceso denegado.");

        }
    }

    // Ver administradores
    public void verAdmin(User usuario) {

        if (usuario.rol.equals("SUPERADMIN")) {

            System.out.println("=== Lista de Administradores ===");

            for (User usuarioLista : admins) {
                System.out.println(usuarioLista.nombre);
            }

        } else {

            System.out.println("Acceso denegado.");

        }
    }
}

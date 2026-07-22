public class Admin extends User {

    public Admin(String nombre, String correo, String contraseña) {

        super(nombre, correo, contraseña, "ADMIN");

    }

    // Agregar usuario
    public void agregarUsuario(UserRepository repositorio, User usuario) {

        repositorio.agregar(usuario);

        System.out.println("Usuario agregado: " + usuario.nombre);

    }

    // Eliminar usuario
    public void eliminarUsuario(UserRepository repositorio, User usuario) {

        repositorio.eliminar(usuario);

        System.out.println("Usuario eliminado: " + usuario.nombre);

    }

    // Ver usuarios
    public void verUsuarios(UserRepository repositorio) {

        System.out.println("=== Lista de Usuarios ===");

        for (User usuarioLista : repositorio.getUsuarios()) {

            System.out.println(usuarioLista.nombre);

        }

    }

}

public class Main {

    public static void main(String[] args) {

        // Crear el tablero
        Tablero tablero = new Tablero();

        // Crear usuarios
        User juan = new User("Juan", "juan@gmail.com", "1234", "USER");
        Admin pedro = new Admin("Pedro", "pedro@gmail.com", "1234");
        SuperAdmin ana = new SuperAdmin("Ana", "ana@gmail.com", "1234");

        // Pedro (Admin) agrega un usuario
        tablero.agregarUsuario(pedro, "Carlos");

        // Juan (User) intenta agregar un usuario
        tablero.agregarUsuario(juan, "Luis");

        // Ana (SuperAdmin) agrega otro usuario
        tablero.agregarUsuario(ana, "María");

        // Ver la lista de usuarios
        tablero.verUsuarios(pedro);
    }
}

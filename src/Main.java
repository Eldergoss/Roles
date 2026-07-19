public class Main {

    public static void main(String[] args) {

        // ==========================
        // Crear el tablero
        // ==========================
        Tablero tablero = new Tablero();

        // ==========================
        // Crear usuarios
        // ==========================
        User juan = new User("Juan", "juan@gmail.com", "1234", "USER");
        User nico = new User("Nico", "nico@gmail.com", "1234", "USER");
        User uriel = new User("Uriel", "uriel@gmail.com", "1234", "USER");

        Admin pedro = new Admin("Pedro", "pedro@gmail.com", "1234");

        SuperAdmin ana = new SuperAdmin("Ana", "ana@gmail.com", "1234");
        SuperAdmin david = new SuperAdmin("David", "david@gmail.com", "1234");

        // ==========================
        // Registrar usuarios
        // ==========================
        tablero.agregarUsuario(pedro, juan);
        tablero.agregarUsuario(pedro, nico);
        tablero.agregarUsuario(ana, uriel);

        // ==========================
        // Ver usuarios registrados
        // ==========================
        tablero.verUsuarios(pedro);

        // ==========================
        // Promover usuarios
        // ==========================
        tablero.promoverAdmin(david, uriel);
        tablero.promoverAdmin(david, nico);

        // ==========================
        // Ver listas finales
        // ==========================
        System.out.println();

        tablero.verUsuarios(pedro);

        System.out.println();

        tablero.verAdmin(david);

    }
}

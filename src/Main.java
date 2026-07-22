public class Main {

    public static void main(String[] args) {

        // ==========================
        // Crear repositorios
        // ==========================
        UserRepository userRepository = new UserRepository();
        AdminRepository adminRepository = new AdminRepository();

        // ==========================
        // Crear usuarios
        // ==========================
        User juan = new User("Juan", "juan@gmail.com", "1234", "USER");
        User uriel = new User("Uriel", "uriel@gmail.com", "1234", "USER");

        Admin pedro = new Admin("Pedro", "pedro@gmail.com", "1234");
        SuperAdmin ana = new SuperAdmin("Ana", "ana@gmail.com", "1234");

        // ==========================
        // Acciones del Admin
        // ==========================

        pedro.agregarUsuario(userRepository, juan);
        pedro.agregarUsuario(userRepository, uriel);

        System.out.println("\nLista de usuarios:");
        pedro.verUsuarios(userRepository);

        // ==========================
        // Acciones del SuperAdmin
        // ==========================

        Admin urielAdmin = ana.promoverAdmin(
                adminRepository,
                userRepository,
                uriel
        );

        System.out.println("\nLista de administradores:");
        ana.verAdmin(adminRepository);

        System.out.println("\nLista de usuarios después de la promoción:");
        pedro.verUsuarios(userRepository);

    }
}

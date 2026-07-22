

//clase hija
public class SuperAdmin extends User {

    public SuperAdmin(String nombre, String correo, String contraseña) {
        super(nombre, correo, contraseña, "SUPERADMIN"); //hereda los constructores de user
    }

    public Admin promoverAdmin(AdminRepository adminrepositorio ,
        UserRepository repositorio ,
        User usuario) {
        // 1. Sacar al usuario de la lista de usuarios
        repositorio.eliminar(usuario);

        // 2. Crear un nuevo objeto Admin
        Admin nuevoAdmin = new Admin(
            usuario.nombre,
            usuario.correo,
            usuario.contraseña
        );

        // 3. Guardarlo en la lista de administradores
        adminrepositorio.agregarAdmin(nuevoAdmin);

        // 4. Devolver el nuevo objeto
        return nuevoAdmin;
    }

    // Ver administradores
    public void verAdmin(AdminRepository adminrepositorio) {
        System.out.println("=== Lista de Administradores ===");

        for (Admin adminLista : adminrepositorio.getAdmins()) {
            System.out.println(adminLista.nombre);
        }
    }

    //eliminacion d admins

    public void eliminarAdmin(AdminRepository adminrepositorio, Admin admin) {
        adminrepositorio.eliminarAdmin(admin);

        System.out.println("Administrador eliminado: " + admin.nombre);
    }
}

import java.util.ArrayList;

public class AdminRepository {

    // Atributo
    private ArrayList<Admin> admins;

    // Constructor
    public AdminRepository() {
        this.admins = new ArrayList<>();
    }

    // Guardar administrador
    public void agregarAdmin(Admin admin) {
        admins.add(admin);
    }

    // Eliminar administrador
    public void eliminarAdmin(Admin admin) {
        admins.remove(admin);
    }

    // Obtener lista de administradores
    public ArrayList<Admin> getAdmins() {
        return admins;
    }

}

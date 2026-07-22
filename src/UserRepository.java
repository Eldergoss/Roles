import java.util.ArrayList;

public class UserRepository {

    // Atributo
    private ArrayList<User> usuarios;

    // Constructor
    public UserRepository() {
        this.usuarios = new ArrayList<>();
    }

    // Guardar usuario
    public void agregar(User usuario) {
        usuarios.add(usuario);
    }

    // Eliminar usuario
    public void eliminar(User usuario) {
        usuarios.remove(usuario);
    }

    // Obtener todos los usuarios
    public ArrayList<User> getUsuarios() {
        return usuarios;
    }
}

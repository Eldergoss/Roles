import java.util.ArrayList;

//clase hija
public class SuperAdmin extends User{

    public SuperAdmin(String nombre,String correo,String contraseña ){

        super(nombre , correo, contraseña ,"SUPERADMIN");//hereda los constructores de user
    }

    //metodos
    public void agregarUsuario(ArrayList<String> usuarios, String nombre) {
    usuarios.add(nombre);
}


    public void verUsuarios(ArrayList<String> usuarios) {
        // recorrer e imprimir
    }

    public void eliminarAdmin(ArrayList<String> admins, String nombre) {
        admins.remove(nombre);
    }



}

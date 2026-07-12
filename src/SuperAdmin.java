import java.util.ArrayList;

//clase hija
public class SuperAdmin extends User{

    public SuperAdmin(String nombre,String correo,String contraseña ){

        super(nombre , correo, contraseña ,"SUPERADMIN");//hereda los constructores de user
    }

}

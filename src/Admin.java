import java.util.ArrayList;

//clase hija
public class Admin extends User{

    public Admin(String nombre,String correo,String contraseña){

        super(nombre , correo, contraseña , "ADMIN");//hereda los constructores de user
    }

}

package services;
import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class GestorUsuario
{
    private List<Usuario> usuarios;

    public GestorUsuario() {usuarios = new ArrayList<>();  }

    // Agregar un usuario
    public void crearUsuario(Usuario u) {
        usuarios.add(u);
        System.out.println("Usuario registrado con éxito");
    }

    public Usuario autenticar(String correo, String contrasena)
    {
        for (Usuario u : usuarios)
        {
            if (u.getCorreo().equals(correo) && u.getContrasena().equals(contrasena))
            {
                System.out.println("Autenticación exitosa");
                return u;
            }
        }
            System.out.println("No se encontro el usuario");
            return null;
        }



    public void cambiarContrasena(String correo, String nuevaContrasena)
    {
        for(Usuario u : usuarios)
        {
            if(u.getCorreo().equals(correo))
            {
                u.setContrasena(nuevaContrasena);
                System.out.println("Cambio de contraseña exitoso");
                return;
            }

        }

        System.out.println("No se encontro el usuario");

    }

}





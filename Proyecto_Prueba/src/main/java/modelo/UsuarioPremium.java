package modelo;

public class UsuarioPremium extends Usuario
{
    public UsuarioPremium(int id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
    }

    @Override
    public void crearTarea(Tarea t)
    {
        gestorTarea.agregarTarea(t);
    }
}
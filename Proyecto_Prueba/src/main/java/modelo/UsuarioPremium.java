package modelo;

public class UsuarioPremium extends Usuario
{
    public UsuarioPremium(int id, String nombre, String correo, String contrasena, boolean membresia) {
        super(id, nombre, correo, contrasena, membresia);
    }

    @Override
    public void crearTarea(Tarea t)
    {
        // Sin límite, simplemente agregamos la tarea
        gestorTarea.agregarTarea(t);
    }
}
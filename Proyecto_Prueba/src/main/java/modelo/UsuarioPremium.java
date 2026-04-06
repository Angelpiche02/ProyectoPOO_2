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

@Override
public void compartirTarea(Tarea t, Usuario xUsuario)
{
    if (xUsuario == null)
    {
        System.out.println("Usuario no valido");
        return;
    }

    for (Usuario u : t.getUsuario2())
    {
        if (u.getId() == xUsuario.getId())
        {
            System.out.println("La tarea ya fue compartida con este usuario");
            return;
        }
    }

    xUsuario.gestorTarea.agregarTarea(t);
    t.agregarUsuario2(xUsuario);

    System.out.println("Tarea compartida con " + xUsuario.getNombre());
}
}
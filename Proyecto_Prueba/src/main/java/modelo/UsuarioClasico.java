package modelo;

public class UsuarioClasico extends Usuario
{
    public UsuarioClasico(int id, String nombre, String correo, String contrasena, boolean membresia) {
        super(id, nombre, correo, contrasena, membresia);
    }

    @Override
    public void crearTarea(Tarea t)
    {
        if (gestorTarea.getCantidadTareas() >= 5)
        {
            System.out.println("Alcanzaste el límite de tareas");
        }
        else
        {
            gestorTarea.agregarTarea(t);
        }
    }

    @Override
    public void compartirTarea(Tarea t, Usuario xUsuario)
    {
        if (t.getCantidadCompartidos() >= 1)
        {
            System.out.println("Solo puedes compartir esta tarea con 1 usuario. Compra el plan premium para compartir con más de 1 usuario.");
            return;
        }

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
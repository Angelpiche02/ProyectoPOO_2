package modelo;

public class UsuarioClasico extends Usuario
{
    public UsuarioClasico(int id, String nombre, String correo, String contrasena, boolean membresia) {
        super(id, nombre, correo, contrasena, membresia);
    }

    @Override
    public void crearTarea(Tarea t)
    {
        if(gestorTarea.getCantidadTareas()>= 5)
        {
            System.out.println("Alcazaste el limite de tareas");
        }else
        {
            gestorTarea.agregarTarea(t);
        }
    }


}

package modelo;
import java.util.ArrayList;
import java.util.List;


public class Tarea extends Elemento
{
    private String estado;
    private String categoria;

    public Tarea() {}
    public Tarea(int id, String titulo, TipoElemento tipo, String descripcion, String nivelPrioridad, String estado, String categoria)
    {
        super(id, titulo, tipo, descripcion, nivelPrioridad);
        this.estado = estado;
        this.categoria = categoria;
    }

    public void setEstado(String estado){this.estado = estado;}
    public void setCategoria(String categoria){this.categoria = categoria;}

    public String getEstado(){return this.estado;}
    public String getCategoria(){return this.categoria;}

    public static List<Elemento> obtenerTareas()
    {
        List<Elemento> tareas = new ArrayList<>();

        for (Elemento e : Elemento.elementos)
        {
            if (e.getTipo() == TipoElemento.TAREA)
            {
                tareas.add(e);
            }
        }
        return tareas;
    }

    public static void mostrarTareas()
    {
        List<Elemento> tareas = obtenerTareas();

        System.out.println("\n--- LISTA DE TAREAS ---");

        for (Elemento e : tareas)
        {
            e.mostrarElemento();
        }
    }










}

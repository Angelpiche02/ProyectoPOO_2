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


}

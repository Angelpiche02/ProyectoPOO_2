package modelo;

public class Elemento
{
    private int id;
    private String titulo;
    public TipoElemento tipo;
    private String descripcion;
    private String nivelPrioridad;

    public Elemento() {}
    public Elemento(int id, String titulo , TipoElemento tipo, String descripcion, String nivelPrioridad)
    {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.nivelPrioridad = nivelPrioridad;
    }



}

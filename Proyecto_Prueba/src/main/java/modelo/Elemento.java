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

    public void setId(int id){this.id = id;}
    public void setTitulo(String titulo){this.titulo = titulo;}
    public void setTipo(TipoElemento tipo){this.tipo = tipo;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public void setNivelPrioridad(String nivelPrioridad){this.nivelPrioridad = nivelPrioridad;}

    public int getId(){return id;}
    public String getTitulo(){return titulo;}
    public TipoElemento getTipo(){return tipo;}
    public String getDescripcion(){return descripcion;}
    public String getNivelPrioridad(){return nivelPrioridad;}




}

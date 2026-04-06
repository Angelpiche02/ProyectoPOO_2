package modelo;

public abstract class Elemento {

    private int id;
    private String titulo;
    private TipoElemento tipo;
    private String descripcion;
    private Prioridad prioridad;

    public Elemento() {}

    public Elemento(int id, String titulo, TipoElemento tipo, String descripcion, Prioridad prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }


    public int getId() {return id;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public Prioridad setPrioridad(Prioridad prioridad) {return prioridad;}


    public void mostrarElemento() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Prioridad: " + prioridad);
    }


    // Este método recibe otro elemento para comparar
    public abstract boolean verificarDuplicados(Elemento e);
}

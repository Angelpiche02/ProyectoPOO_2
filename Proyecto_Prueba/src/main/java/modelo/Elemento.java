package modelo;
import modelo.TipoElemento;

public abstract class Elemento {

    private int id;
    private String titulo;
    private TipoElemento tipo;
    private String descripcion;
    private String nivelPrioridad;

    public Elemento() {}

    public Elemento(int id, String titulo, TipoElemento tipo, String descripcion, String nivelPrioridad) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.nivelPrioridad = nivelPrioridad;
    }


    public int getId() {return id;}
    public String getTitulo() {return titulo;}
    public TipoElemento getTipo() {return tipo;}
    public String getDescripcion() {return descripcion;}
    public String getNivelPrioridad() {return nivelPrioridad;}


    public void setId(int id) {this.id = id;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setTipo(TipoElemento tipo) {this.tipo = tipo;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setNivelPrioridad(String nivelPrioridad){this.nivelPrioridad = nivelPrioridad;}


    public void mostrarElemento() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Prioridad: " + nivelPrioridad);
    }

    // Este método recibe otro elemento para comparar
    public abstract boolean verificarDuplicados(Elemento e);
}


}


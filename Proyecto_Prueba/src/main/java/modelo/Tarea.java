package modelo;


public class Tarea extends Elemento {

    private Estado estado;
    private String categoria;

    public Tarea() {}

    public Tarea(int id, String titulo, TipoElemento tipo, String descripcion,
                 String nivelPrioridad, Estado estado, String categoria) {

        super(id, titulo, tipo, descripcion, nivelPrioridad);
        this.estado = estado;
        this.categoria = categoria;
    }

    public void setEstado(Estado estado){this.estado = estado;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getEstado() {return estado;}
    public String getCategoria() {return categoria;}

    @Override
    public void mostrarElemento() {
        super.mostrarElemento(); // Muestra lo de Elemento
        System.out.println("Estado: " + estado);
        System.out.println("Categoria: " + categoria);
        System.out.println("---------------------------");
    }
}
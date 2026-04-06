package modelo;


public class Tarea extends Elemento {

    private String estado;
    private String categoria;

    public Tarea() {}

    public Tarea(int id, String titulo, TipoElemento tipo, String descripcion,
                 String nivelPrioridad, String estado, String categoria) {

        super(id, titulo, tipo, descripcion, nivelPrioridad);
        this.estado = estado;
        this.categoria = categoria;
    }

    public void setEstado(String estado){this.estado = estado;}
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

    @Override
    public boolean verificarDuplicados(Elemento e) {
        if (e instanceof Tarea) {   //e es una instancia de la clase Tarea
            Tarea t = (Tarea) e;

            return this.titulo.equalsIgnoreCase(t.titulo) &&
                    this.descripcion.equalsIgnoreCase(t.descripcion);
        }
        return false;
    }}
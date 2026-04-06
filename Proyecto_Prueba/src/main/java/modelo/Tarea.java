package modelo;


public class Tarea extends Elemento {

    private Estado estado;
    private String categoria;

    public Tarea() {}

    public Tarea(int id, String titulo, TipoElemento tipo, String descripcion,
                 Prioridad prioridad, Estado estado, String categoria) {

        super(id, titulo, tipo, descripcion, prioridad);
        this.estado = estado;
        this.categoria = categoria;
    }

    @Override
    public void mostrarElemento() {
        mostrarBase(); // Muestra lo de Elemento
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
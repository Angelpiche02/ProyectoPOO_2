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

        // Ver si son de la misma clase
        if (this.getClass() != e.getClass()) {
            return false;
        }

        // Convertir
        Tarea t = (Tarea) e;

        // Comparacion
        if (this.titulo.equalsIgnoreCase(t.titulo) &&
                this.descripcion.equalsIgnoreCase(t.descripcion)) {

            return true;
        }

        return false;
    }
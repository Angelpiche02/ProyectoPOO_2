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

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("Estado: " + this.estado); // Asegúrate que la variable se llame 'estado'
        System.out.println("---------------------------");
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

    public static void buscarTarea(java.util.List<Elemento> lista, String textoABuscar) {

        // 1. Validacion de lista vacia
        if (lista == null || lista.isEmpty()) {
            System.out.println("No hay tareas registradas para realizar la busqueda.");
            return;
        }

        System.out.println("--- Iniciando busqueda de: [" + textoABuscar + "] ---");
        boolean encontrada = false;

        for (Elemento e : lista) {
            // 2. Verificamos que sea una Tarea
            if (e instanceof Tarea) {
                Tarea t = (Tarea) e;

                // 3. Busqueda inteligente:
                // .toLowerCase() ignora mayusculas/minusculas
                // .contains() permite encontrar "Parcial de POO" buscando solo "POO"
                if (t.getTitulo().toLowerCase().contains(textoABuscar.toLowerCase())) {
                    System.out.println("¡Coincidencia encontrada!");
                    t.mostrarElemento();
                    encontrada = true;
                }
            }
        }

        // 4. Si recorriotodo y no encontro nada
        if (!encontrada) {
            System.out.println("No se encontro ninguna tarea que coincida con: '" + textoABuscar + "'");
        }
    }









}

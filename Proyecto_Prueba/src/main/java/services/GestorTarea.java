package services;
import modelo.Tarea;
import java.util.ArrayList;
import java.util.List;


public class GestorTarea
{
    private List<Tarea> tareas;

    public GestorTarea() {
        tareas = new ArrayList<>();
    }

    // Agregar tarea
    public void agregarTarea(Tarea t) {
        tareas.add(t);
        System.out.println("Tarea agregada con éxito");
    }

    // Mostrar todas las tareas
    public void mostrarTareas() {

        System.out.println("\nListado de tareas: ");

        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        for (Tarea t : tareas) {
            t.mostrarElemento();
        }
    }

    public int getCantidadTareas()
    {
        return tareas.size();
    }

    // Buscar por título
    public void buscarTarea(String texto) {

        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para buscar.");
            return;
        }

        boolean encontrada = false;

        System.out.println("\nBuscando: " + texto);

        for (Tarea t : tareas) {

            if (t.getTitulo() != null &&
                    t.getTitulo().toLowerCase().contains(texto.toLowerCase())) {

                System.out.println("¡Tarea encontrada!");
                t.mostrarElemento();
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna tarea.");
        }
    }

}



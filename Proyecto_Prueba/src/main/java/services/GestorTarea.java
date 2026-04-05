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

}

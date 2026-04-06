package services;
import modelo.Prioridad;
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
    public void agregarTarea(Tarea nueva) {

        for (Tarea t : tareas) {
            if (t.verificarDuplicados(nueva)) {
                System.out.println("Tarea duplicada");
                return;
            }
        }

        tareas.add(nueva);
        System.out.println("Tarea agregada con exito");
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

                System.out.println("Tarea encontrada!");
                t.mostrarElemento();
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontro ninguna tarea.");
        }
    }

    public void modificarTarea(int id,String nuevotitulo,String nuevadescripcion,Prioridad nuevaPrioridad)
    {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para modificar");
            return;
        }

        for (Tarea t: tareas) {

            if (t.getId() == id) {

                t.setTitulo(nuevotitulo);
                t.setDescripcion(nuevadescripcion);
                t.setPrioridad(nuevaPrioridad);
                System.out.println("Tarea modificada con exito");
                return;
            }
        }

        System.out.println("Tarea no encontrada");
    }

    public void borrarTarea(int id) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas para borrar");
            return;
        }

        for (Tarea t : tareas) {
            if (t.getId() == id) {
                tareas.remove(t);
                System.out.println("Tarea borrada con exito");
                return;
            }
        }

        System.out.println("Tarea no encontrada");
    }

}



package services;
import modelo.Recordatorio;
import java.util.ArrayList;
import java.util.List;


public class GestorRecordatorio
{
    private List<Recordatorio> recordatorios;

    public GestorRecordatorio() {
        recordatorios = new ArrayList<>();
    }

    // Agregar recordatorio
    public void agregarRecordatorio(Recordatorio r) {
        recordatorios.add(r);
        System.out.println("Recordatorio agregado con éxito");
    }

    // Mostrar todos los recordatorios
    public void mostrarRecordatorios() {

        System.out.println("\nLista de recordatorios:");

        if (recordatorios.isEmpty()) {
            System.out.println("No hay recordatorios registrados.");
            return;
        }

        for (Recordatorio r : recordatorios) {
            r.mostrarElemento();
        }
    }

    // Borrar recordatorio por título
    public void borrarRecordatorio(String tituloABorrar) {

        if (recordatorios.isEmpty()) {
            System.out.println("La lista está vacía, nada que borrar.");
            return;
        }

        Recordatorio recordatorioAEliminar = null;
        boolean encontrado = false;

        // Convertimos el título de búsqueda a minúsculas
        String tituloBusqueda = tituloABorrar.toLowerCase();

        for (Recordatorio r : recordatorios) {
            if (r.getTitulo() != null) {
                String tituloActual = r.getTitulo().toLowerCase();

                if (tituloActual.equals(tituloBusqueda)) {
                    recordatorioAEliminar = r;
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado && recordatorioAEliminar != null) {
            recordatorios.remove(recordatorioAEliminar);
            System.out.println("Recordatorio '" + tituloABorrar + "' eliminado.");
        } else {
            System.out.println("No se encontró el recordatorio: " + tituloABorrar);
        }
    }

}

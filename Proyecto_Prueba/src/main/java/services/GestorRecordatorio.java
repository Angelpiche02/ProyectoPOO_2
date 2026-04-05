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

}

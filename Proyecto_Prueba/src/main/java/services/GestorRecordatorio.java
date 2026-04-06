package services;
import modelo.Prioridad;
import modelo.Recordatorio;
import modelo.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class GestorRecordatorio
{
    private List<Recordatorio> recordatorios;

    public GestorRecordatorio() {
        recordatorios = new ArrayList<>();
    }

    // Agregar recordatorio
    public void agregarRecordatorio(Recordatorio nuevo) {

        for (Recordatorio r : recordatorios) {
            if (r.verificarDuplicados(nuevo)) {
                System.out.println("Recordatorio duplicado");
                return;
            }
        }

        recordatorios.add(nuevo);
        System.out.println("Recordatorio agregado con exito");
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

    // Buscar recordatorio por título
    public void buscarRecordatorio(String texto) {

        if (recordatorios.isEmpty()) {
            System.out.println("No hay recordatorios para buscar.");
            return;
        }

        boolean encontrado = false;

        System.out.println("\nBuscando: " + texto);

        // Convertimos el texto de búsqueda a minúsculas
        String textoBusqueda = texto.toLowerCase();

        for (Recordatorio r : recordatorios) {
            if (r.getTitulo() != null) {
                // Convertimos el título del recordatorio a minúsculas
                String tituloActual = r.getTitulo().toLowerCase();

                // Comparación sencilla y legible
                if (tituloActual.equals(textoBusqueda)) {
                    System.out.println("¡Recordatorio encontrado!");
                    r.mostrarElemento();
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún recordatorio con: " + texto);
        }
    }

    public void modificarRecordatorio(int id, String nuevotitulo, String nuevadescripcion, Prioridad nuevaPrioridad , LocalDate nuevaFecha)
    {
        if (recordatorios.isEmpty()) {
            System.out.println("No hay recordatorios para modificar");
            return;
        }

        for (Recordatorio r: recordatorios) {

            if (r.getId() == id) {

                r.setTitulo(nuevotitulo);
                r.setDescripcion(nuevadescripcion);
                r.setPrioridad(nuevaPrioridad);
                r.setFecha(nuevaFecha);
                System.out.println("Recordatorio modificado con éxito");
                return;
            }
        }

        System.out.println("Recordatorio no encontrado");
    }


}

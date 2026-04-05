package modelo;
import java.util.ArrayList;
import java.util.List;

/**
 - Clase que representa a un usuario con privilegios especiales.
 - Aplica conceptos de encapsulamiento y gestion de colecciones dinamicas.
 */
public class UsuarioPremium {

    // Atributos privados
    private String nombreUsuario;
    private List<Elemento> listaElementos; // Lista polimorfica que guarda Tareas y Recordatorios

    public List<Elemento> getListaElementos() {
        return this.listaElementos;
    }


    // Constructor que inicializa el nombre y la lista de elementos como un ArrayList vacio
    public UsuarioPremium(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.listaElementos = new ArrayList<>();
    }

    // Metodo para agregar tareas sin restricciones de limite
    public void crearTareaIlimitada(Elemento nuevoElemento) {
        this.listaElementos.add(nuevoElemento);
        System.out.println("Elemento '" + nuevoElemento.getTitulo() + "' agregado.");
    }

    // Metodo que permite compartir una tarea con multiples usuarios usando una lista de correos
    public void compartirTarea(Tarea tareaACompartir, List<String> listaCorreos) {
        System.out.print("Compartiendo '" + tareaACompartir.getTitulo() + "' con: ");
        // Ciclo for-each para recorrer la lista de personas con quienes se comparte
        for (String correo : listaCorreos) {
            System.out.print(correo + " ");
        }
        System.out.println("\n[Proceso completado]");
    }

    // Metodo especial que modifica el objeto Recordatorio para marcarlo como colaborativo

    public void crearRecordatorioColaborativo(Recordatorio nuevoRecordatorio) {
        // Se obtiene el titulo actual, se modifica y se vuelve a setear (uso de Getters y Setters)
        String tituloOriginal = nuevoRecordatorio.getTitulo();
        nuevoRecordatorio.setTitulo("[COLABORATIVO] " + tituloOriginal);

        this.listaElementos.add(nuevoRecordatorio);
        System.out.println("[Premium] Recordatorio colaborativo creado y listo para modificacion grupal.");
    }

    // Metodo que recorre la lista y usa POLIMORFISMO para mostrar cada elemento

    public void mostrarPerfilPremium() {
        System.out.println("=== USUARIO: " + nombreUsuario.toUpperCase() + " ===");
        for (Elemento elementoActual : listaElementos) {
            // Se llama al metodo mostrarElemento() que cada clase hija implementa a su manera
            elementoActual.mostrarElemento();
        }
    }
}
import modelo.*;
import services.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Gestor de usuarios
        GestorUsuario gestorUsuario = new GestorUsuario();

        // -----------------------
        // Crear Usuario Clasico
        // -----------------------
        UsuarioClasico usuarioClasico = new UsuarioClasico(1, "Juan Perez", "juan@mail.com", "1234", false);
        gestorUsuario.crearUsuario(usuarioClasico);

        // -----------------------
        // Crear Usuario Premium con login
        // -----------------------
        UsuarioPremiumConLogin usuarioPremium = new UsuarioPremiumConLogin(2, "Ana Lopez", "ana@mail.com", "abcd", true);
        gestorUsuario.crearUsuario(usuarioPremium);

        // -----------------------
        // Autenticación
        // -----------------------
        System.out.println("\n--- Autenticación Usuario Clasico ---");
        gestorUsuario.autenticar("juan@mail.com", "1234");

        System.out.println("\n--- Autenticación Usuario Premium ---");
        gestorUsuario.autenticar("ana@mail.com", "abcd");

        // -----------------------
        // Agregar tareas
        // -----------------------
        usuarioClasico.crearTarea(new Tarea(1, "Tarea Clasico 1", TipoElemento.TAREA, "Descripción 1", "Alta", "Pendiente", "Trabajo"));
        usuarioPremium.crearTarea(new Tarea(1, "Tarea Premium 1", TipoElemento.TAREA, "Descripción 1", "Alta", "Pendiente", "Personal"));

        // -----------------------
        // Agregar recordatorios
        // -----------------------
        usuarioClasico.crearRecordatorio(new Recordatorio(1, "Recordatorio Clasico", TipoElemento.RECORDATORIO, "Comprar leche", "Media", LocalDate.now().plusDays(1)));
        usuarioPremium.crearRecordatorio(new Recordatorio(1, "Recordatorio Premium", TipoElemento.RECORDATORIO, "Pagar luz", "Alta", LocalDate.now().plusDays(2)));

        // -----------------------
        // Mostrar resultados
        // -----------------------
        System.out.println("\nTareas del Usuario Clasico:");
        usuarioClasico.verTareas();

        System.out.println("\nRecordatorios del Usuario Clasico:");
        usuarioClasico.verRecordatorios();

        System.out.println("\nTareas del Usuario Premium:");
        usuarioPremium.verTareas();

        System.out.println("\nRecordatorios del Usuario Premium:");
        usuarioPremium.verRecordatorios();
    }
}
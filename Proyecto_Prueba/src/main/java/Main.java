import modelo.*;
import services.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GestorUsuario gestorUsuario = new GestorUsuario();

        Usuario u1 = new UsuarioClasico(1, "Angel", "angel@gmail.com", "1234");
        Usuario u2 = new UsuarioPremium(2, "Luis", "luis@gmail.com", "abcd");

        gestorUsuario.crearUsuario(u1);
        gestorUsuario.crearUsuario(u2);

        Usuario usuarioLogeado = gestorUsuario.autenticar("angel@gmail.com", "1234");

        if (usuarioLogeado == null) {
            System.out.println("No se puede continuar sin login");
            return;
        }

        gestorUsuario.cambiarContrasena("angel@gmail.com", "9999");


        Tarea t1 = new Tarea(1, "Estudiar", TipoElemento.TAREA, "POO examen", Prioridad.ALTA, Estado.PENDIENTE, "Estudio");
        Tarea t2 = new Tarea(2, "Gym", TipoElemento.TAREA, "Pierna", Prioridad.MEDIA, Estado.EN_PROGRESO, "Salud");
        Tarea t3 = new Tarea(3, "Estudiar", TipoElemento.TAREA, "POO examen", Prioridad.ALTA, Estado.PENDIENTE, "Estudio"); // duplicada

        u1.crearTarea(t1);
        u1.crearTarea(t2);
        u1.crearTarea(t3); // detecta duplicado

        u1.crearTarea(new Tarea(4, "Tarea4", TipoElemento.TAREA, "Desc", Prioridad.BAJA, Estado.PENDIENTE, "X"));
        u1.crearTarea(new Tarea(5, "Tarea5", TipoElemento.TAREA, "Desc", Prioridad.BAJA, Estado.PENDIENTE, "X"));
        u1.crearTarea(new Tarea(6, "Tarea6", TipoElemento.TAREA, "Desc", Prioridad.BAJA, Estado.PENDIENTE, "X")); // bloquea por límite

        Recordatorio r1 = new Recordatorio(1, "Cita", TipoElemento.RECORDATORIO, "Doctor", Prioridad.ALTA, LocalDate.of(2026, 4, 10));
        Recordatorio r2 = new Recordatorio(2, "Pago", TipoElemento.RECORDATORIO, "Tarjeta", Prioridad.MEDIA, LocalDate.of(2026, 4, 15));
        Recordatorio r3 = new Recordatorio(3, "Cita", TipoElemento.RECORDATORIO, "Doctor", Prioridad.ALTA, LocalDate.of(2026, 4, 10)); // duplicado

        u1.crearRecordatorio(r1);
        u1.crearRecordatorio(r2);
        u1.crearRecordatorio(r3); // detecta duplicado

        for (int i = 0; i < 7; i++) {
            u2.crearTarea(new Tarea(100 + i, "Tarea Premium " + i, TipoElemento.TAREA,
                    "Extra Premium", Prioridad.MEDIA, Estado.PENDIENTE, "Extra"));
        }

        Recordatorio rp1 = new Recordatorio(10, "Reunion", TipoElemento.RECORDATORIO, "Team Meeting", Prioridad.ALTA, LocalDate.of(2026, 4, 12));
        Recordatorio rp2 = new Recordatorio(11, "Pago Premium", TipoElemento.RECORDATORIO, "Suscripcion", Prioridad.MEDIA, LocalDate.of(2026, 4, 18));
        Recordatorio rp3 = new Recordatorio(10, "Reunion", TipoElemento.RECORDATORIO, "Team Meeting", Prioridad.ALTA, LocalDate.of(2026, 4, 12)); // duplicado

        u2.crearRecordatorio(rp1);
        u2.crearRecordatorio(rp2);
        u2.crearRecordatorio(rp3); // detecta duplicado

        System.out.println("\n=== USUARIO CLÁSICO ===");
        System.out.println("Nombre: " + u1.getNombre());
        System.out.println("Correo: " + u1.getCorreo());
        System.out.println("\n--- TAREAS ---");
        u1.verTareas();
        System.out.println("\n--- RECORDATORIOS ---");
        u1.verRecordatorios();

        System.out.println("\n=== USUARIO PREMIUM ===");
        System.out.println("Nombre: " + u2.getNombre());
        System.out.println("Correo: " + u2.getCorreo());
        System.out.println("\n--- TAREAS ---");
        u2.verTareas();
        System.out.println("\n--- RECORDATORIOS ---");
        u2.verRecordatorios();

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
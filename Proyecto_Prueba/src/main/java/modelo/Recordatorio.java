package modelo;
import java.time.LocalDate;

public class Recordatorio extends Elemento {

    private LocalDate fecha;
    private boolean alertaActiva = false;

    public Recordatorio() {}

    public Recordatorio(int id, String titulo, TipoElemento tipo, String descripcion, String nivelPrioridad, LocalDate fecha)
    {
        super(id, titulo, tipo, descripcion, nivelPrioridad);
        this.fecha = fecha;
    }


    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public boolean isAlertaActiva() { return alertaActiva; }

    public void activarAlerta() {
        this.alertaActiva = true;
        System.out.println("!!! ALERTA ACTIVADA !!!");
        System.out.println("Recordatorio: " + this.getTitulo());
        System.out.println("Estado: Pendiente de revisión.");
    }

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("Fecha: " + fecha);
        System.out.println("Alerta activa: " + alertaActiva);
        System.out.println("---------------------------");
    }
}
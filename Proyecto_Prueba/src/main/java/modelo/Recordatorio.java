package modelo;
import java.time.LocalDate;

public class Recordatorio extends Elemento {

    private LocalDate fecha;
    private boolean alertaActiva = false;

    public Recordatorio() {}

    public Recordatorio(int id, String titulo, TipoElemento tipo, String descripcion, Prioridad prioridad, LocalDate fecha)
    {
        super(id, titulo, tipo, descripcion, prioridad);
        this.fecha = fecha;
    }


    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public boolean isAlertaActiva() { return alertaActiva; }


    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("Fecha: " + fecha);
        System.out.println("Alerta activa: " + alertaActiva);
        System.out.println("---------------------------");
    }

    @Override
    public boolean verificarDuplicados(Elemento e) {
        if (e instanceof Recordatorio) {
            Recordatorio r = (Recordatorio) e;

            return this.titulo.equalsIgnoreCase(r.titulo) &&
                    this.fecha.equals(r.fecha);
        }
        return false;
    }
}
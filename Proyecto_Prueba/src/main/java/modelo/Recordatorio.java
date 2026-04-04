package modelo;
import java.util.ArrayList;
import java.util.List;

public class Recordatorio extends Elemento {

    //La variable se debe cambiar a localDate
    private String fecha;

    public Recordatorio() {}

    public Recordatorio(int id, String titulo, TipoElemento tipo,String descripcion, String nivelPrioridad,String fecha)
    {
        super(id, titulo, tipo, descripcion, nivelPrioridad);
        this.fecha = fecha;
    }

    





}
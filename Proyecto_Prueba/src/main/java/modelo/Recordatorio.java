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

    public String getFecha(){return this.fecha;}
    public void setFecha(String fecha){this.fecha = fecha;}

    public static List<Elemento> obtenerRecordatorios()
    {
        List<Elemento> recordatorios = new ArrayList<>();

        for (Elemento e : Elemento.elementos)
        {
            if (e.getTipo() == TipoElemento.RECORDATORIO)
            {
                recordatorios.add(e);
            }
        }

        return recordatorios;
    }

    public static void mostrarRecordatorios()
    {
        List<Elemento> recordatorios = obtenerRecordatorios();

        System.out.println("\n--- LISTA DE RECORDATORIOS ---");

        for (Elemento e : recordatorios)
        {
            e.mostrarElemento();
        }
    }












}
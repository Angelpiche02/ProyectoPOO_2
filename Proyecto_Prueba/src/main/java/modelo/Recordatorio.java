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

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("Fecha: " + this.fecha); // Asegúrate que la variable se llame 'estado'
        System.out.println("---------------------------");

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

    //metodo borrar recordatorio donde recorre la lista y verifica si hay o no elementos
    public static void borrarRecordatorio(java.util.List<Elemento> lista, String tituloABorrar) {


        if (lista == null || lista.isEmpty()) {
            System.out.println("La lista está vacía, nada que borrar.");
            return;
        }

        // 2. Usamos un Iterator para buscar y borrar
        java.util.Iterator<Elemento> it = lista.iterator();
        boolean encontrado = false;

        while (it.hasNext()) {
            Elemento e = it.next();
            // 3. Si es un Recordatorio y el título coincide (ignorando mayúsculas)
            if (e instanceof Recordatorio && e.getTitulo().equalsIgnoreCase(tituloABorrar)) {
                it.remove();
                encontrado = true;
                System.out.println("Recordatorio '" + tituloABorrar + "' eliminado.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el recordatorio: " + tituloABorrar);
        }
    }

    // Atributo nuevo para saber si la alerta esta encendida
    private boolean alertaActiva = false;

    //metodo activarAlerta
    public void activarAlerta() {
        this.alertaActiva = true;
        System.out.println("!!! ALERTA ACTIVADA !!!");
        System.out.println("Recordatorio: " + this.getTitulo());
        System.out.println("Estado: Pendiente de revision.");
    }

    // Getter para consultar el estado de la alerta
    public boolean isAlertaActiva() {
        return alertaActiva;
    }

}
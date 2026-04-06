package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tarea extends Elemento {

    private String estado;
    private String categoria;
    private List<Usuario> Usuario2;

    public Tarea() {
        this.Usuario2 = new ArrayList<>();
    }

    public Tarea(int id, String titulo, TipoElemento tipo, String descripcion,
                 String nivelPrioridad, String estado, String categoria) {

        super(id, titulo, tipo, descripcion, nivelPrioridad);
        this.estado = estado;
        this.categoria = categoria;
        this.Usuario2 = new ArrayList<>();
    }

    public void setEstado(String estado){ this.estado = estado; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getEstado() { return estado; }
    public String getCategoria() { return categoria; }

    public List<Usuario> getUsuario2() {
        return Usuario2;
    }

    public void agregarUsuario2(Usuario usuario){
        Usuario2.add(usuario);
    }

    public int getCantidadCompartidos(){
        return Usuario2.size();
    }

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("Estado: " + estado);
        System.out.println("Categoria: " + categoria);
        System.out.println("---------------------------");
    }
}
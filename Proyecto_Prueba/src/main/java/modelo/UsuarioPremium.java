package modelo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioPremium {

    private String nombreUsuario;
    private List<Elemento> listaElementos;

    public UsuarioPremium(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.listaElementos = new ArrayList<>();
    }

    public List<Elemento> getListaElementos() {
        return listaElementos;
    }
    public void agregarElemento(Elemento elemento) {
        listaElementos.add(elemento);
    }


    public void mostrarPerfil() {
        System.out.println("=== USUARIO: " + nombreUsuario.toUpperCase() + " ===");
        listaElementos.forEach(Elemento::mostrarElemento);
    }
}
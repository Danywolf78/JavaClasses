package classe.poo.escenario2.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Categoria {

    public String nombre;

    public boolean isEstaElProductoDisponible() {
        return estaElProductoDisponible;
    }

    public void setEstaElProductoDisponible(boolean estaElProductoDisponible) {
        this.estaElProductoDisponible = estaElProductoDisponible;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String description;
    public boolean estaElProductoDisponible;
    private List<Producto> listaProductos = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEstaElProductoDisponible() {
        return estaElProductoDisponible;
    }

    public void setEstaElProductoDisponible(Boolean estaElProductoDisponible) {
        this.estaElProductoDisponible = estaElProductoDisponible;
    }


}




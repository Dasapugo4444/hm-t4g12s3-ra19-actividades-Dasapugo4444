package co.edu.sena.actividad03;

import java.util.Objects;

public class Producto {

    private String idProducto;
    private String nombre;
    private float precio;
    private int cantidadDisponible;
    private Item item;

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Float.compare(producto.precio, precio) == 0 &&
                cantidadDisponible == producto.cantidadDisponible &&
                Objects.equals(idProducto, producto.idProducto) &&
                Objects.equals(nombre, producto.nombre) &&
                Objects.equals(item, producto.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombre, precio, cantidadDisponible, item);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto='" + idProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                ", item=" + item +
                '}';
    }
}

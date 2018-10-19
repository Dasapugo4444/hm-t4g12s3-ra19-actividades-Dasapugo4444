package co.edu.sena.actividad03;

import java.util.Objects;

public class Item {

    private int cantidad;
    private float precioVenta;
    private float valorTotal;
    private Producto productos;
    private Factura factura;

    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return cantidad == item.cantidad &&
                Float.compare(item.precioVenta, precioVenta) == 0 &&
                Float.compare(item.valorTotal, valorTotal) == 0 &&
                Objects.equals(productos, item.productos) &&
                Objects.equals(factura, item.factura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad, precioVenta, valorTotal, productos, factura);
    }

    @Override
    public String toString() {
        return "Item{" +
                "cantidad=" + cantidad +
                ", precioVenta=" + precioVenta +
                ", valorTotal=" + valorTotal +
                ", productos=" + productos +
                ", factura=" + factura +
                '}';
    }
}

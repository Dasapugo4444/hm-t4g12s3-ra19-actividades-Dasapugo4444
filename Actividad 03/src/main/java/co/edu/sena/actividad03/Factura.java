package co.edu.sena.actividad03;

import java.util.Date;
import java.util.Objects;

public class Factura {

    private int idFactura;
    private Date fecha;
    private float totalFactura;
    private float iva;
    private Item items;
    private Cliente cliente;



    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(float totalFactura) {
        this.totalFactura = totalFactura;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return idFactura == factura.idFactura &&
                Float.compare(factura.totalFactura, totalFactura) == 0 &&
                Float.compare(factura.iva, iva) == 0 &&
                Objects.equals(fecha, factura.fecha) &&
                Objects.equals(items, factura.items) &&
                Objects.equals(cliente, factura.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, fecha, totalFactura, iva, items, cliente);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", fecha=" + fecha +
                ", totalFactura=" + totalFactura +
                ", iva=" + iva +
                ", items=" + items +
                ", cliente=" + cliente +
                '}';
    }
}

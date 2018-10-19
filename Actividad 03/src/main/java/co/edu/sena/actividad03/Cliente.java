package co.edu.sena.actividad03;

import java.util.Collection;
import java.util.Objects;

public class Cliente {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String direccion;
    private String telefono;
    private Collection<Factura> Factura;


    public Collection<Factura> getFactura() {
        return Factura;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFactura(Collection<Factura> factura) {
        Factura = factura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(tipoDocumento, cliente.tipoDocumento) &&
                Objects.equals(numeroDocumento, cliente.numeroDocumento) &&
                Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(direccion, cliente.direccion) &&
                Objects.equals(telefono, cliente.telefono) &&
                Objects.equals(Factura, cliente.Factura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDocumento, numeroDocumento, nombre, direccion, telefono, Factura);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", Factura=" + Factura +
                '}';
    }
}

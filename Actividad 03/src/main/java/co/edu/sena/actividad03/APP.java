package co.edu.sena.actividad03;


import java.util.Collection;
import java.util.Date;

public class APP {

    public static void main(String[] args) {

       Cliente c1=new Cliente();
        c1.setNombre("Santiago");
        c1.setTelefono("1231556");
        c1.setTipoDocumento("Cedula");
        c1.setNumeroDocumento("216813");
        c1.setDireccion("acvsa 12");


       Cliente c2=new Cliente();
        c2.setNombre("Laura");
        c2.setTelefono("5646845");
        c2.setTipoDocumento("Cédula");
        c2.setNumeroDocumento("6846346");
        c2.setDireccion("asd 564");


       Factura f1=new Factura();
        f1.setCliente(c1);
        f1.setFecha(new Date(2/10/2018));
        f1.setIdFactura(1);
        f1.setIva(19);



       Factura f2=new Factura();
        f2.setCliente(c1);
        f2.setFecha(new Date(2/5/2018));
        f2.setIdFactura(2);
        f2.setIva(19);



       Factura f3=new Factura();
        f3.setCliente(c2);
        f3.setFecha(new Date(5/9/2017));
        f3.setIdFactura(3);
        f3.setIva(19);



       Factura f4=new Factura();
        f4.setCliente(c2);
        f4.setFecha(new Date(5/8/2018));
        f4.setIdFactura(4);
        f4.setIva(19);



       Item i1=new Item();
        i1.setProductos(new Producto());
        i1.setFactura(f1);
        i1.setCantidad(2);


       Item i2=new Item();
        i2.setProductos(new Producto());
        i2.setFactura(f2);
        i2.setCantidad(2);


       Producto p1=new Producto();
        p1.setNombre("Zapatos");
        p1.setPrecio(120000);
        p1.setIdProducto("1");
        p1.setCantidadDisponible(20);

       Producto p2=new Producto();
        p2.setNombre("Camisas");
        p2.setPrecio(50000);
        p2.setIdProducto("2");
        p2.setCantidadDisponible(50);

       Producto p3=new Producto();
        p3.setNombre("Camisetas");
        p3.setPrecio(30000);
        p3.setIdProducto("3");
        p3.setCantidadDisponible(10);

       Producto p4=new Producto();
        p4.setNombre("Pantalones");
        p4.setPrecio(60000);
        p4.setIdProducto("4");
        p4.setCantidadDisponible(5);

       Producto p5=new Producto();
        p5.setNombre("Busos");
        p5.setPrecio(50000);
        p5.setIdProducto("5");
        p5.setCantidadDisponible(25);

       Producto p6=new Producto();
        p6.setNombre("Chaquetas");
        p6.setPrecio(80000);
        p6.setIdProducto("6");
        p6.setCantidadDisponible(15);

       Producto p7=new Producto();
        p7.setNombre("Gorras");
        p7.setPrecio(20000);
        p7.setIdProducto("7");
        p7.setCantidadDisponible(15);

       Producto p8=new Producto();
        p8.setNombre("Medias");
        p8.setPrecio(5000);
        p8.setIdProducto("8");
        p8.setCantidadDisponible(30);


    }

}

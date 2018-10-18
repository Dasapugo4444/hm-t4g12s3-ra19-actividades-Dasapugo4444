package co.edu.sena.actividad01.partes;

public class Lector extends Parte {

    private double ancho;
    private double alto;
    private double largo;


    public Lector(double ancho, double alto, double largo, String serial, String marca) {
        this.ancho=ancho;
        this.alto=alto;
        this.largo=largo;
    }

    public Lector(String serial, String marca) {
        super(serial, marca);
    }
}

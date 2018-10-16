package co.edu.sena.actividad01.partes;

public class Parte {

    private String serial;
    private String marca;

    public Parte(String serial, String marca){

    }

    public Parte() {

    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getSerial(){
        return serial;
    }

    public void setSerial(String serial){
        this.serial=serial;
    }
}

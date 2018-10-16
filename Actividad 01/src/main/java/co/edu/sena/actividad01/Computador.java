package co.edu.sena.actividad01;

import co.edu.sena.actividad01.dispositivo.salida.Impresora;
import co.edu.sena.actividad01.dispositivo.salida.Monitor;
import co.edu.sena.actividad01.dispositivo.entrada.Camara;
import co.edu.sena.actividad01.dispositivo.entrada.Scanner;
import co.edu.sena.actividad01.dispositivo.entrada.Teclado;
import co.edu.sena.actividad01.dispositivo.entradasalida.Multifuncional;
import co.edu.sena.actividad01.partes.Torre;
import co.edu.sena.actividad01.dispositivo.entrada.Mouse;

public class Computador {

    private Torre torre;
    private Mouse Mouse;
    private Teclado teclado;
    private Monitor pantalla;
    private Camara camara = new Camara(null,null);
    private Impresora impresora = new Impresora(null,null);
    private Multifuncional multifuncional = new Multifuncional(null,null);
    private Scanner scanner = new Scanner(null,null);

    public Computador(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla){

    }

    public Torre getTorre() {
        return torre;
    }

    public void setTorre(Torre torre) {
        this.torre = torre;
    }

    public co.edu.sena.actividad01.dispositivo.entrada.Mouse getMouse() {
        return Mouse;
    }

    public void setMouse(co.edu.sena.actividad01.dispositivo.entrada.Mouse mouse) {
        Mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public Multifuncional getMultifuncional() {
        return multifuncional;
    }

    public void setMultifuncional(Multifuncional multifuncional) {
        this.multifuncional = multifuncional;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}

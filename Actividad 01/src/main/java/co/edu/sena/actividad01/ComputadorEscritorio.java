package co.edu.sena.actividad01;

import co.edu.sena.actividad01.dispositivo.entrada.Mouse;
import co.edu.sena.actividad01.dispositivo.entrada.Teclado;
import co.edu.sena.actividad01.dispositivo.salida.Monitor;
import co.edu.sena.actividad01.partes.Torre;

public class ComputadorEscritorio extends Computador{

    public ComputadorEscritorio(Torre torre, Mouse mouse, Teclado teclado, Monitor pantalla){
        super(torre, mouse, teclado, pantalla);
    }

}

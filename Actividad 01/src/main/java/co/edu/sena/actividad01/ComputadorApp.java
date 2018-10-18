package co.edu.sena.actividad01;

import co.edu.sena.actividad01.dispositivo.entrada.Mouse;
import co.edu.sena.actividad01.dispositivo.entrada.Teclado;
import co.edu.sena.actividad01.dispositivo.salida.Monitor;
import co.edu.sena.actividad01.partes.*;

public class ComputadorApp {
    public static void main(String[] args) {

        ComputadorEscritorio escritorio=new ComputadorEscritorio(new Torre(new DiscoDuro("123","asd"),
                new MotherBoard("123","asd"),
                new RAM("123","asd"),
                new Fuente("a123","ads"),
                new Procesador("a123","asd"),
                new Disipador("3","asd"),
                "123","asd"),
                new Mouse("213","asd"),
                new Teclado("123","asd"),
                new Monitor("1q3","asd"));

        escribirComputador(escritorio, escritorio);

        ComputadorPortatil portatil=new ComputadorPortatil(new Torre(new DiscoDuro("666","aaa"),
                new MotherBoard("555","sss"),
                new RAM("777","asdasd"),
                new Fuente("234","sad"),
                new Procesador("26","cnb"),
                new Disipador("653","ukf"),
                "2356","dgj"),
                new Mouse("1245","fkl"),
                new Teclado("759","ghi"),
                new Monitor("84","hgñ`gu"));

        escribirComputador(portatil, portatil);
    }

    public static void escribirComputador(Computador escritorio, Computador portatil){

        System.out.println(escritorio.getTeclado().getMarca());
        System.out.println(escritorio.getTeclado().getSerial());
        System.out.println(escritorio.getMouse().getMarca());
        System.out.println(escritorio.getMouse().getSerial());
        System.out.println(escritorio.getTorre().getDiscoDuro().getMarca());
        System.out.println(escritorio.getTorre().getDiscoDuro().getSerial());
        System.out.println(escritorio.getTorre().getDisipador().getMarca());
        System.out.println(escritorio.getTorre().getDisipador().getSerial());
        System.out.println(escritorio.getTorre().getProcesador().getMarca());
        System.out.println(escritorio.getTorre().getProcesador().getSerial());
        System.out.println(escritorio.getTorre().getTarjetaMadre().getMarca());
        System.out.println(escritorio.getTorre().getTarjetaMadre().getSerial());

        System.out.println("--------------");

        System.out.println(portatil.getTeclado().getMarca());
        System.out.println(portatil.getTeclado().getSerial());
        System.out.println(portatil.getMouse().getMarca());
        System.out.println(portatil.getMouse().getSerial());
        System.out.println(portatil.getTorre().getDiscoDuro().getMarca());
        System.out.println(portatil.getTorre().getDiscoDuro().getSerial());
        System.out.println(portatil.getTorre().getDisipador().getMarca());
        System.out.println(portatil.getTorre().getDisipador().getSerial());
        System.out.println(portatil.getTorre().getProcesador().getMarca());
        System.out.println(portatil.getTorre().getProcesador().getSerial());
        System.out.println(portatil.getTorre().getTarjetaMadre().getMarca());
        System.out.println(portatil.getTorre().getTarjetaMadre().getSerial());

    }
}
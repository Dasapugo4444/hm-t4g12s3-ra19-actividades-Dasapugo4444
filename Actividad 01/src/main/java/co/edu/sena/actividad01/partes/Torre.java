package co.edu.sena.actividad01.partes;

public class Torre extends Parte {

    private DiscoDuro discoDuro;
    private MotherBoard tarjetaMadre;
    private RAM tarjetaMemoria;
    private Fuente fuente;
    private Procesador procesador;
    private Disipador disipador;
    private LectorCD lectorCD = new LectorCD(0.0,0.0,0.0,null,null);
    private LectorDVD lectorDVD = new LectorDVD(0.0,0.0,0.0,null,null);
    private LectorBR lectorBR = new LectorBR(0.0,0.0,0.0,null,null);
    private LectorDisquette lectorDisquette = new LectorDisquette(0.00,0.0,0.0,null,null);
    private TarjetaSonido tarjetaSonido = new TarjetaSonido(null,null);
    private TarjetaVideo tarjetaVideo = new TarjetaVideo(null,null);
    private Bateria bateria = new Bateria(null,null);

    public Torre(DiscoDuro discoDuro,MotherBoard tarjetaMadre, RAM tarjetaMemoria, Fuente fuente, Procesador procesador, Disipador disipador, String serial, String marca){

    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    public MotherBoard getTarjetaMadre() {
        return tarjetaMadre;
    }

    public void setTarjetaMadre(MotherBoard tarjetaMadre) {
        this.tarjetaMadre = tarjetaMadre;
    }

    public RAM getTarjetaMemoria() {
        return tarjetaMemoria;
    }

    public void setTarjetaMemoria(RAM tarjetaMemoria) {
        this.tarjetaMemoria = tarjetaMemoria;
    }

    public Fuente getFuente() {
        return fuente;
    }

    public void setFuente(Fuente fuente) {
        this.fuente = fuente;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Disipador getDisipador() {
        return disipador;
    }

    public void setDisipador(Disipador disipador) {
        this.disipador = disipador;
    }

    public LectorCD getLectorCD() {
        return lectorCD;
    }

    public void setLectorCD(LectorCD lectorCD) {
        this.lectorCD = lectorCD;
    }

    public LectorDVD getLectorDVD() {
        return lectorDVD;
    }

    public void setLectorDVD(LectorDVD lectorDVD) {
        this.lectorDVD = lectorDVD;
    }

    public LectorBR getLectorBR() {
        return lectorBR;
    }

    public void setLectorBR(LectorBR lectorBR) {
        this.lectorBR = lectorBR;
    }

    public LectorDisquette getLectorDisquette() {
        return lectorDisquette;
    }

    public void setLectorDisquette(LectorDisquette lectorDisquette) {
        this.lectorDisquette = lectorDisquette;
    }

    public TarjetaSonido getTarjetaSonido() {
        return tarjetaSonido;
    }

    public void setTarjetaSonido(TarjetaSonido tarjetaSonido) {
        this.tarjetaSonido = tarjetaSonido;
    }

    public TarjetaVideo getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
}

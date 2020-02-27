package ejercicios;

public class Celular {
    private String marca;
    private int camara;
    private String procesador;
    private int bateria;

    //Constructor de la clase Celular
    public Celular(String marca, int camara, String procesador, int bateria) {
        this.marca = marca;
        this.camara = camara;
        this.procesador = procesador;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}

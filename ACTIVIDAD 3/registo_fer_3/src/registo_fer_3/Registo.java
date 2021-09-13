package registo_fer_3;

public class Registo {

    private String Marca;
    private String modelo;
    private double talla;
    private int serie;

    public Registo() {
        this.Marca = " no tiene ";
        this.modelo = " no tiene ";
        this.talla = 0;
        this.serie = 0;
    }

    public Registo(String Marca, String modelo, double talla, int serie) {
        this.Marca = Marca;
        this.modelo = modelo;
        this.talla = talla;
        this.serie = serie;
    }

    public Registo(int serie) {
        this.serie = serie;
    }

    public Registo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Marca es " + getMarca() + ", Modelo es " + getModelo() + ", Talla es " + getTalla() + ", Serie es " + getSerie();
    }
}

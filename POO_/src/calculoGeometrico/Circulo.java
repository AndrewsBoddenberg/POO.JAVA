package calculoGeometrica;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String calculaArea() {
        return (Math.pow(this.raio, 2)*3.14;
    }

    @Override
    public String calculaPerimetro() {
        return 2*3.14* this.raio;
    }

    @Override
    public String calculaVolume() {
        return 4/3*3.14(Math.pow(this.raio, 3));
    }
}








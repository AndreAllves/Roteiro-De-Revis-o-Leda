package areas;

public class Circulo implements Calculavel{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaArea() {
        return this.raio != 0 ? Math.PI * Math.pow(this.raio, 2) : 0;
    }
}

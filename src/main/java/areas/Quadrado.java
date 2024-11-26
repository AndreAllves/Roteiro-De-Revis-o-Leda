package areas;

public class Quadrado implements Calculavel{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calculaArea() {
        return Math.pow(lado, 2);
    }
}

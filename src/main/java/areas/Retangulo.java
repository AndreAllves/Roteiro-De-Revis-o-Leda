package areas;

public class Retangulo implements Calculavel{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calculaArea() {
        return this.base != 0 && this.altura != 0 ? this.base * this.altura : 0;
    }
}
package areas;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Triangulo triangulo = new Triangulo(4, 6);
        System.out.println("A area do triângulo é " + triangulo.calculaArea());

        System.out.println();

        Retangulo retangulo = new Retangulo(6, 3);
        System.out.println("A area do retangulo é " + retangulo.calculaArea());

        System.out.println();

        Quadrado quadrado = new Quadrado(4);
        System.out.println("A area do quadrado é " + quadrado.calculaArea());

        System.out.println();

        Circulo circulo = new Circulo(2.00);
        System.out.println("A area do circulo é " + String.format("%.4f", circulo.calculaArea()));

        System.out.println();
    } 
}

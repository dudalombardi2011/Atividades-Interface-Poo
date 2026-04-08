package srcCalculadoraSala.main;

import srcCalculadoraSala.entidades.CalculadoraSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular retangulo = new CalculadoraSalaRetangular();
        retangulo.calcularArea(20, 10);
        retangulo.calcularPerimetro(4, 8);
    }
}

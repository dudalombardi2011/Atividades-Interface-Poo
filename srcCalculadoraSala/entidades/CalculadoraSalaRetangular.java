package srcCalculadoraSala.entidades;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(int altura, int largura){
        int area = altura*largura;
        System.out.println("A area é: "+ area);
    }

    @Override
    public void calcularPerimetro(int altura, int largura){
        int perimetro = (2*altura)+(2*largura);
        System.out.println("O perimetro é: "+ perimetro);
    }
}

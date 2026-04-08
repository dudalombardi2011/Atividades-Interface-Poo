package srcVendavel.entidades;

public interface Vendavel {
    public double calcularPrecoTotal(int quantidade);
    public double aplicardesconto(int quantidade, double percentualDesconto);
}

package srcVendavel.entidades;

public class Produto implements Vendavel{
    private String nome;
    private double valor;

    @Override
    public double calcularPrecoTotal(int quantidade){
        return quantidade*valor;
    }

     @Override
    public double aplicardesconto(int quantidade, double percentualDesconto){
       double total= calcularPrecoTotal(quantidade);
       double valorFinal = total - total*(percentualDesconto/100);
        return valorFinal;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    

    
}

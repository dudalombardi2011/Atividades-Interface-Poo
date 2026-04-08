package srcVendavel.entidades;

public class Servico implements Vendavel{
    private String nome;
    private double valorDoServico;

    @Override
    public double calcularPrecoTotal(int quantidade){
        return quantidade*valorDoServico;
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

    public double getValorDoServico() {
        return valorDoServico;
    }

    public void setValorDoServico(double valorDoServico) {
        this.valorDoServico = valorDoServico;
    }

    public Servico(String nome, double valorDoServico) {
        this.nome = nome;
        this.valorDoServico = valorDoServico;
    }

    
    
}

package srcCalculavel.main;

import srcCalculavel.entidades.Livro;
import srcCalculavel.entidades.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Claudio");
        double precofinal=livro.calcularPrecoFinal(10);
        System.out.println("Preco final do livro: "+precofinal);
        ProdutoFisico produto = new ProdutoFisico();
        double precofinal2=produto.calcularPrecoFinal(20);
        System.out.println("Preço final do produto : "+precofinal2);
    }
}

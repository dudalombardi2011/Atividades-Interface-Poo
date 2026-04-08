package srcVendavel.main;

import srcVendavel.entidades.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("pao", 100);
        double precototalinicial= produto.calcularPrecoTotal(2);
        System.out.println("Preço total inicial: "+precototalinicial);
        double precoTotalComDesconto= produto.aplicardesconto(2, 10);
        System.out.println("Preço apos desconto: "+precoTotalComDesconto);


    }
}

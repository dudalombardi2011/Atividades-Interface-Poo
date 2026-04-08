package srcCalculavel.entidades;

public class Livro implements Calculavel{
    private String autor;

    @Override
    public double calcularPrecoFinal(double preco){
        return preco * 0.9;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String autor) {
        this.autor = autor;
    }

    
    
}

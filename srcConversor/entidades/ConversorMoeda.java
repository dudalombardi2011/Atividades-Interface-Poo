package entidades;

public class ConversorMoeda implements ConersaoFinanceira {
    @Override
    public void converterDolarReal(double valor){
        double cotacaoDolar=4.80;
        double valorreal=valor*cotacaoDolar;
        System.out.println("O valor em real é: "+ valorreal);
    }
}

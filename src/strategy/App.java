package strategy;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        Euro euro = new Euro();
        Dolar dolar = new Dolar();

        Doacao doacaoEmEuro = new Doacao(euro, BigDecimal.TEN);
        Doacao doacaoEmDolar = new Doacao(dolar, BigDecimal.TEN);

        System.out.println("Valor Doação Euro em Reais: " + doacaoEmEuro.getValor());
        System.out.println("Valor Doação Dolar em Reais: " + doacaoEmDolar.getValor());
    }
}

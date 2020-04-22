package strategy;

import java.math.BigDecimal;

public class Doacao {

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Doacao(CambioDeMoeda cambioDeMoeda, BigDecimal valorDoacao) {

        valor = cambioDeMoeda.calcularValorEmReais(valorDoacao);
    }
}

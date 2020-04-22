package strategy;

import java.math.BigDecimal;

public class Euro implements CambioDeMoeda {

    @Override
    public BigDecimal calcularValorEmReais(BigDecimal valorDoacao) {

        return valorDoacao.multiply(getCotacao());
    }

    private BigDecimal getCotacao() {

        return BigDecimal.valueOf(5.77);
    }

}

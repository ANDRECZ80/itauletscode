package br.com.letscode.turmaitau.contabancaria;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numero, BigDecimal saldo) {
        super(numero, saldo);
    }

    @Override
    protected void depositar(BigDecimal valor) {
        super.adicionarDinheiro(valor);
    }
}

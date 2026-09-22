package org.examples;

public class Cliente {

    private IContrato contrato;
    private IProcuracao procuracao;

    public Cliente(IFabricaAbstrata fabrica) {
        this.contrato = fabrica.criarContrato();
        this.procuracao = fabrica.criarProcuracao();
    }

    public String obterContrato() {
        return this.contrato.emitir();
    }

    public String cancelarContrato() {
        return "Contrato cancelado";
    }
}

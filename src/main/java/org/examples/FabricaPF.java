package org.examples;

public class FabricaPF implements IFabricaAbstrata {

    private static FabricaPF instancia = new FabricaPF();

    private FabricaPF() {}

    public static FabricaPF getInstance() {
        return instancia;
    }

    @Override
    public IContrato criarContrato() {
        return new ContratoPF();
    }

    @Override
    public IProcuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}

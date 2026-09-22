package org.examples;

public class FabricaPJ implements IFabricaAbstrata{

    private static FabricaPJ instancia = new FabricaPJ();

    private FabricaPJ() {}

    public static FabricaPJ getInstance() {
        return instancia;
    }

    @Override
    public IContrato criarContrato() {
        return new ContratoPJ();
    }

    @Override
    public IProcuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }
}

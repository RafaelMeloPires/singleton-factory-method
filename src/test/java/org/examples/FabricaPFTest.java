package org.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaPFTest {

    @Test
    void deveRetornarMesmaInstanciaSingleton() {
        FabricaPF instancia1 = FabricaPF.getInstance();
        FabricaPF instancia2 = FabricaPF.getInstance();
        assertSame(instancia1, instancia2);
    }

    @Test
    void deveCriarContratoPF() {
        IFabricaAbstrata fabrica = FabricaPF.getInstance();
        IContrato contrato = fabrica.criarContrato();
        assertTrue(contrato instanceof ContratoPF);
    }

    @Test
    void deveCriarProcuracaoPF() {
        IFabricaAbstrata fabrica = FabricaPF.getInstance();
        IProcuracao procuracao = fabrica.criarProcuracao();
        assertTrue(procuracao instanceof ProcuracaoPF);
    }
}
package org.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcuracaoPJTest {

    @Test
    void deveEmitirProcuracaoPJ() {
        IProcuracao procuracao = new ProcuracaoPJ();
        assertEquals("Procuracao de PJ emitida", procuracao.emitir());
    }
}
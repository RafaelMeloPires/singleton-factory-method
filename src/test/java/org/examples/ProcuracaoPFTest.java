package org.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcuracaoPFTest {

    @Test
    void deveEmitirProcuracaoPF() {
        IProcuracao procuracao = new ProcuracaoPF();
        assertEquals("Procuracao de PF emitida", procuracao.emitir());
    }
}
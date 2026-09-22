package org.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {

    @Test
    void deveRetornarFabricaPF() {
        IFabricaAbstrata fabrica = FactoryMethod.obterFabrica("PF");
        assertTrue(fabrica instanceof FabricaPF);
    }

    @Test
    void deveRetornarFabricaPJ() {
        IFabricaAbstrata fabrica = FactoryMethod.obterFabrica("PJ");
        assertTrue(fabrica instanceof FabricaPJ);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FactoryMethod.obterFabrica("Fabrica inexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fabrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoParaFabricaInvalida() {
        try {
            FactoryMethod.obterFabrica("Cliente"); // Classe existe mas não é IFabricaAbstrata
            fail("Deveria ter lançado uma exceção");
        } catch (IllegalArgumentException e) {
            assertEquals("Fabrica inexistente", e.getMessage());
        }
    }
}
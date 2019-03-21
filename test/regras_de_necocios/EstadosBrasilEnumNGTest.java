/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regras_de_necocios;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author p005347
 */
public class EstadosBrasilEnumNGTest {
    
    public EstadosBrasilEnumNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método values, da classe EstadosBrasilEnum.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        EstadosBrasilEnum[] expResult = null;
        EstadosBrasilEnum[] result = EstadosBrasilEnum.values();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método valueOf, da classe EstadosBrasilEnum.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        EstadosBrasilEnum expResult = null;
        EstadosBrasilEnum result = EstadosBrasilEnum.valueOf(name);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

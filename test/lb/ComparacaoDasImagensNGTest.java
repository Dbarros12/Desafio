/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lb;

import java.awt.image.BufferedImage;
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
public class ComparacaoDasImagensNGTest {
    
    public ComparacaoDasImagensNGTest() {
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
     * Teste de método setParamento, da classe ComparacaoDasImagens.
     */
    @Test
    public void testSetParamento() {
        System.out.println("setParamento");
        int comparex = 0;
        int comparey = 0;
        int factorA = 0;
        int factorD = 0;
        ComparacaoDasImagens instance = new ComparacaoDasImagens();
        instance.setParamento(comparex, comparey, factorA, factorD);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método comparaImagens, da classe ComparacaoDasImagens.
     */
    @Test
    public void testComparaImagens() {
        System.out.println("comparaImagens");
        BufferedImage imagem1 = null;
        BufferedImage imagem2 = null;
        ComparacaoDasImagens instance = new ComparacaoDasImagens();
        boolean expResult = false;
        boolean result = instance.comparaImagens(imagem1, imagem2);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método comparaImagem, da classe ComparacaoDasImagens.
     */
    @Test
    public void testComparaImagem() {
        System.out.println("comparaImagem");
        BufferedImage imagem1 = null;
        BufferedImage imagem2 = null;
        ComparacaoDasImagens instance = new ComparacaoDasImagens();
        boolean expResult = false;
        boolean result = instance.comparaImagem(imagem1, imagem2);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getAverageBrightness, da classe ComparacaoDasImagens.
     */
    @Test
    public void testGetAverageBrightness() {
        System.out.println("getAverageBrightness");
        BufferedImage img = null;
        ComparacaoDasImagens instance = new ComparacaoDasImagens();
        int expResult = 0;
        int result = instance.getAverageBrightness(img);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

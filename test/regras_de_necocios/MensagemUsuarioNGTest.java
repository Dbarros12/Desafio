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
public class MensagemUsuarioNGTest {
    
    public MensagemUsuarioNGTest() {
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
     * Teste de método mensagemAviso, da classe MensagemUsuario.
     */
    @Test
    public void testMensagemAviso() {
        System.out.println("mensagemAviso");
        String menssagem = "";
        MensagemUsuario.mensagemAviso(menssagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método mensagemAlerta, da classe MensagemUsuario.
     */
    @Test
    public void testMensagemAlerta() {
        System.out.println("mensagemAlerta");
        String menssagem = "";
        MensagemUsuario.mensagemAlerta(menssagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método mensagemErro, da classe MensagemUsuario.
     */
    @Test
    public void testMensagemErro() {
        System.out.println("mensagemErro");
        String menssagem = "";
        MensagemUsuario.mensagemErro(menssagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regras_de_necocios;

import java.util.ArrayList;
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
public class UsuarioLoginNGTest {
    
    public UsuarioLoginNGTest() {
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
     * Teste de método getCaminhoDaImagem, da classe UsuarioLogin.
     */
    @Test
    public void testGetCaminhoDaImagem() {
        System.out.println("getCaminhoDaImagem");
        UsuarioLogin instance = new UsuarioLogin();
        String expResult = "";
        String result = instance.getCaminhoDaImagem();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCaminhoDaImagem, da classe UsuarioLogin.
     */
    @Test
    public void testSetCaminhoDaImagem() {
        System.out.println("setCaminhoDaImagem");
        String caminhoDaImagem = "";
        UsuarioLogin instance = new UsuarioLogin();
        instance.setCaminhoDaImagem(caminhoDaImagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getListUser, da classe UsuarioLogin.
     */
    @Test
    public void testGetListUser() {
        System.out.println("getListUser");
        UsuarioLogin instance = new UsuarioLogin();
        ArrayList expResult = null;
        ArrayList result = instance.getListUser();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setListUser, da classe UsuarioLogin.
     */
    @Test
    public void testSetListUser() {
        System.out.println("setListUser");
        ArrayList<UsuarioLogin> listUser = null;
        UsuarioLogin instance = new UsuarioLogin();
        instance.setListUser(listUser);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getIDUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testGetIDUsuario() {
        System.out.println("getIDUsuario");
        UsuarioLogin instance = new UsuarioLogin();
        int expResult = 0;
        int result = instance.getIDUsuario();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setIDUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testSetIDUsuario() {
        System.out.println("setIDUsuario");
        int IDUsuario = 0;
        UsuarioLogin instance = new UsuarioLogin();
        instance.setIDUsuario(IDUsuario);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método isConsultaUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testIsConsultaUsuario() {
        System.out.println("isConsultaUsuario");
        UsuarioLogin instance = new UsuarioLogin();
        boolean expResult = false;
        boolean result = instance.isConsultaUsuario();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setConsultaUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testSetConsultaUsuario() {
        System.out.println("setConsultaUsuario");
        boolean consultaUsuario = false;
        UsuarioLogin instance = new UsuarioLogin();
        instance.setConsultaUsuario(consultaUsuario);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNomeUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testGetNomeUsuario() {
        System.out.println("getNomeUsuario");
        UsuarioLogin instance = new UsuarioLogin();
        String expResult = "";
        String result = instance.getNomeUsuario();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNomeUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testSetNomeUsuario() {
        System.out.println("setNomeUsuario");
        String nomeUsuario = "";
        UsuarioLogin instance = new UsuarioLogin();
        instance.setNomeUsuario(nomeUsuario);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getSenha, da classe UsuarioLogin.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        UsuarioLogin instance = new UsuarioLogin();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setSenha, da classe UsuarioLogin.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        UsuarioLogin instance = new UsuarioLogin();
        instance.setSenha(senha);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNomeDaImagem, da classe UsuarioLogin.
     */
    @Test
    public void testGetNomeDaImagem() {
        System.out.println("getNomeDaImagem");
        UsuarioLogin instance = new UsuarioLogin();
        String expResult = "";
        String result = instance.getNomeDaImagem();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNomeDaImagem, da classe UsuarioLogin.
     */
    @Test
    public void testSetNomeDaImagem() {
        System.out.println("setNomeDaImagem");
        String nomeDaImagem = "";
        UsuarioLogin instance = new UsuarioLogin();
        instance.setNomeDaImagem(nomeDaImagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getTipoDeUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testGetTipoDeUsuario() {
        System.out.println("getTipoDeUsuario");
        UsuarioLogin instance = new UsuarioLogin();
        String expResult = "";
        String result = instance.getTipoDeUsuario();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setTipoDeUsuario, da classe UsuarioLogin.
     */
    @Test
    public void testSetTipoDeUsuario() {
        System.out.println("setTipoDeUsuario");
        String TipoDeUsuario = "";
        UsuarioLogin instance = new UsuarioLogin();
        instance.setTipoDeUsuario(TipoDeUsuario);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

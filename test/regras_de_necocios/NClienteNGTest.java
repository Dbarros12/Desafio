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
public class NClienteNGTest {
    
    public NClienteNGTest() {
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
     * Teste de método consultaLogin, da classe NCliente.
     */
    @Test
    public void testConsultaLogin_String() {
        System.out.println("consultaLogin");
        String chave = "";
        NCliente instance = null;
        UsuarioLogin expResult = null;
        UsuarioLogin result = instance.consultaLogin(chave);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método consultaLogin, da classe NCliente.
     */
    @Test
    public void testConsultaLogin_String_String() {
        System.out.println("consultaLogin");
        String chave = "";
        String chave2 = "";
        NCliente instance = null;
        UsuarioLogin expResult = null;
        UsuarioLogin result = instance.consultaLogin(chave, chave2);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método consultaCliente, da classe NCliente.
     */
    @Test
    public void testConsultaCliente() {
        System.out.println("consultaCliente");
        String cpf = "";
        NCliente instance = null;
        Cliente expResult = null;
        Cliente result = instance.consultaCliente(cpf);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método excluirCliente, da classe NCliente.
     */
    @Test
    public void testExcluirCliente() {
        System.out.println("excluirCliente");
        String chave = "";
        NCliente instance = null;
        instance.excluirCliente(chave);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método excluirUsuario, da classe NCliente.
     */
    @Test
    public void testExcluirUsuario() {
        System.out.println("excluirUsuario");
        int Id = 0;
        NCliente instance = null;
        instance.excluirUsuario(Id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método inserirCliente, da classe NCliente.
     */
    @Test
    public void testInserirCliente() {
        System.out.println("inserirCliente");
        Cliente cliente = null;
        NCliente instance = null;
        instance.inserirCliente(cliente);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método inserirLogin, da classe NCliente.
     */
    @Test
    public void testInserirLogin() {
        System.out.println("inserirLogin");
        UsuarioLogin usuarioLogin = null;
        NCliente instance = null;
        instance.inserirLogin(usuarioLogin);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método updateCliente, da classe NCliente.
     */
    @Test
    public void testUpdateCliente() {
        System.out.println("updateCliente");
        Cliente cliente = null;
        NCliente instance = null;
        instance.updateCliente(cliente);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método updateLogin, da classe NCliente.
     */
    @Test
    public void testUpdateLogin() {
        System.out.println("updateLogin");
        UsuarioLogin usuarioLogin = null;
        NCliente instance = null;
        instance.updateLogin(usuarioLogin);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

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
public class ClienteNGTest {
    
    public ClienteNGTest() {
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
     * Teste de método getCpf, da classe Cliente.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCpf, da classe Cliente.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Cliente instance = new Cliente();
        instance.setCpf(cpf);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getCep, da classe Cliente.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCep();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCep, da classe Cliente.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Cliente instance = new Cliente();
        instance.setCep(cep);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getRua, da classe Cliente.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getRua();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setRua, da classe Cliente.
     */
    @Test
    public void testSetRua() {
        System.out.println("setRua");
        String rua = "";
        Cliente instance = new Cliente();
        instance.setRua(rua);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNumero, da classe Cliente.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNumero, da classe Cliente.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Cliente instance = new Cliente();
        instance.setNumero(numero);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNone, da classe Cliente.
     */
    @Test
    public void testGetNone() {
        System.out.println("getNone");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNone();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNone, da classe Cliente.
     */
    @Test
    public void testSetNone() {
        System.out.println("setNone");
        String none = "";
        Cliente instance = new Cliente();
        instance.setNone(none);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNomeMae, da classe Cliente.
     */
    @Test
    public void testGetNomeMae() {
        System.out.println("getNomeMae");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNomeMae();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNomeMae, da classe Cliente.
     */
    @Test
    public void testSetNomeMae() {
        System.out.println("setNomeMae");
        String nomeMae = "";
        Cliente instance = new Cliente();
        instance.setNomeMae(nomeMae);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getEmail, da classe Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setEmail, da classe Cliente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Cliente instance = new Cliente();
        instance.setEmail(email);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getCidade, da classe Cliente.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setCidade, da classe Cliente.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        Cliente instance = new Cliente();
        instance.setCidade(cidade);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getBairro, da classe Cliente.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setBairro, da classe Cliente.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        Cliente instance = new Cliente();
        instance.setBairro(bairro);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getUfEndreco, da classe Cliente.
     */
    @Test
    public void testGetUfEndreco() {
        System.out.println("getUfEndreco");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getUfEndreco();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setUfEndreco, da classe Cliente.
     */
    @Test
    public void testSetUfEndreco() {
        System.out.println("setUfEndreco");
        String ufEndreco = "";
        Cliente instance = new Cliente();
        instance.setUfEndreco(ufEndreco);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

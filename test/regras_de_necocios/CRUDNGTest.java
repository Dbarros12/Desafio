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
public class CRUDNGTest {
    
    public CRUDNGTest() {
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
     * Teste de método statementexecuteUpdate, da classe CRUD.
     */
    @Test
    public void testStatementexecuteUpdate() {
        System.out.println("statementexecuteUpdate");
        String sql = "";
        CRUD instance = null;
        instance.statementexecuteUpdate(sql);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método conectionDb, da classe CRUD.
     */
    @Test
    public void testConectionDb() {
        System.out.println("conectionDb");
        CRUD instance = null;
        instance.conectionDb();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método desconect, da classe CRUD.
     */
    @Test
    public void testDesconect() {
        System.out.println("desconect");
        CRUD instance = null;
        instance.desconect();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método criateTable, da classe CRUD.
     */
    @Test
    public void testCriateTable() {
        System.out.println("criateTable");
        CRUD instance = null;
        instance.criateTable();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método insertTableUser, da classe CRUD.
     */
    @Test
    public void testInsertTableUser() {
        System.out.println("insertTableUser");
        CRUD instance = null;
        instance.insertTableUser();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlInserirLoginUser, da classe CRUD.
     */
    @Test
    public void testSqlInserirLoginUser() {
        System.out.println("sqlInserirLoginUser");
        UsuarioLogin usuarioLogin = null;
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlInserirLoginUser(usuarioLogin);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlInserirCliente, da classe CRUD.
     */
    @Test
    public void testSqlInserirCliente() {
        System.out.println("sqlInserirCliente");
        Cliente cliente = null;
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlInserirCliente(cliente);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlUpdateCliente, da classe CRUD.
     */
    @Test
    public void testSqlUpdateCliente() {
        System.out.println("sqlUpdateCliente");
        Cliente cliente = null;
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlUpdateCliente(cliente);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlUpdateLogin, da classe CRUD.
     */
    @Test
    public void testSqlUpdateLogin() {
        System.out.println("sqlUpdateLogin");
        UsuarioLogin usuarioLogin = null;
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlUpdateLogin(usuarioLogin);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlExcluirUsuarioId, da classe CRUD.
     */
    @Test
    public void testSqlExcluirUsuarioId() {
        System.out.println("sqlExcluirUsuarioId");
        int Id = 0;
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlExcluirUsuarioId(Id);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlExcluirCliente, da classe CRUD.
     */
    @Test
    public void testSqlExcluirCliente() {
        System.out.println("sqlExcluirCliente");
        String chave = "";
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlExcluirCliente(chave);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlConsultaLogin, da classe CRUD.
     */
    @Test
    public void testSqlConsultaLogin_String() {
        System.out.println("sqlConsultaLogin");
        String chave = "";
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlConsultaLogin(chave);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlConsultaLogin, da classe CRUD.
     */
    @Test
    public void testSqlConsultaLogin_String_String() {
        System.out.println("sqlConsultaLogin");
        String chave = "";
        String chave2 = "";
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlConsultaLogin(chave, chave2);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método sqlConsultaCliente, da classe CRUD.
     */
    @Test
    public void testSqlConsultaCliente() {
        System.out.println("sqlConsultaCliente");
        String cpf = "";
        CRUD instance = null;
        String expResult = "";
        String result = instance.sqlConsultaCliente(cpf);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método isSelectUser, da classe CRUD.
     */
    @Test
    public void testIsSelectUser() {
        System.out.println("isSelectUser");
        CRUD instance = null;
        boolean expResult = false;
        boolean result = instance.isSelectUser();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

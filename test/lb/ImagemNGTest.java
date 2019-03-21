/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lb;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JLabel;
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
public class ImagemNGTest {
    
    public ImagemNGTest() {
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
     * Teste de método deletarImagem, da classe Imagem.
     */
    @Test
    public void testDeletarImagem() {
        System.out.println("deletarImagem");
        String caminho = "";
        Imagem instance = new Imagem();
        boolean expResult = false;
        boolean result = instance.deletarImagem(caminho);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método salvaImagem, da classe Imagem.
     */
    @Test
    public void testSalvaImagem() {
        System.out.println("salvaImagem");
        String nomeDaImagem = "";
        String caminhoDaImagem = "";
        String nomeDaPasta = "";
        byte[] imagemByte = null;
        Imagem.salvaImagem(nomeDaImagem, caminhoDaImagem, nomeDaPasta, imagemByte);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método colocarImagemLabel, da classe Imagem.
     */
    @Test
    public void testColocarImagemLabel_JLabel_byteArr() {
        System.out.println("colocarImagemLabel");
        JLabel label = null;
        byte[] imagemArryByte = null;
        Imagem.colocarImagemLabel(label, imagemArryByte);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método colocarImagemLabel, da classe Imagem.
     */
    @Test
    public void testColocarImagemLabel_JLabel_BufferedImage() {
        System.out.println("colocarImagemLabel");
        JLabel label = null;
        BufferedImage bufferedImage = null;
        Imagem.colocarImagemLabel(label, bufferedImage);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método coverteImagemEmArryByte, da classe Imagem.
     */
    @Test
    public void testCoverteImagemEmArryByte() {
        System.out.println("coverteImagemEmArryByte");
        BufferedImage bufferedImage = null;
        Imagem instance = new Imagem();
        byte[] expResult = null;
        byte[] result = instance.coverteImagemEmArryByte(bufferedImage);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método coverterImagemEmArryDeByte, da classe Imagem.
     */
    @Test
    public void testCoverterImagemEmArryDeByte() {
        System.out.println("coverterImagemEmArryDeByte");
        File arquivo = null;
        Imagem instance = new Imagem();
        byte[] expResult = null;
        byte[] result = instance.coverterImagemEmArryDeByte(arquivo);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método coverterParaBufferedImage, da classe Imagem.
     */
    @Test
    public void testCoverterParaBufferedImage_byteArr() {
        System.out.println("coverterParaBufferedImage");
        byte[] imageData = null;
        Imagem instance = new Imagem();
        BufferedImage expResult = null;
        BufferedImage result = instance.coverterParaBufferedImage(imageData);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método coverterParaBufferedImage, da classe Imagem.
     */
    @Test
    public void testCoverterParaBufferedImage_String() {
        System.out.println("coverterParaBufferedImage");
        String caminhoDaImagem = "";
        Imagem instance = new Imagem();
        BufferedImage expResult = null;
        BufferedImage result = instance.coverterParaBufferedImage(caminhoDaImagem);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}

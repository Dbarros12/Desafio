/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras_de_necocios;

import javax.swing.JOptionPane;

/**
 *
 * @author Diogo Barros
 */
public class MensagemUsuario {
    
    public static void mensagemAviso(String menssagem){
        
        JOptionPane.showMessageDialog(null, menssagem);
        
    }
    
    public static void mensagemAlerta(String menssagem){
        
        JOptionPane.showMessageDialog(null, menssagem,"Alerta", JOptionPane.WARNING_MESSAGE);
        
    }
    
    public static void mensagemErro(String menssagem){
        
        JOptionPane.showMessageDialog(null, menssagem,"Erro", JOptionPane.ERROR_MESSAGE);
        
    }
    
}

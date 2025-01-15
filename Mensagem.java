/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mensagem;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Mensagem {
    public static String mensagem(int n) {
        
        if (n == 1)
            return("Seja bem-vindo, Senhor!");
        
        else
            return("Seja bem-vinda, Senhora!");
       
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo: (1)Masculino (2)Feminino "));
        JOptionPane.showMessageDialog(null, "" + mensagem(num));
    }
}


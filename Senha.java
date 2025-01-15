/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senha;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Senha {

    public static void main(String[] args) {
        int  s = 1, t = 0;
        
        while (s != t){
            t = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
               if (s == t)
               JOptionPane.showMessageDialog(null,"Acesso Autorizado");
        }
    }
}



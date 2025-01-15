/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplosde3;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class MultiplosDe3 {

    public static void main(String[] args) {
        int v, c = 1;
        
        while (c == 1){
            v = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if (v%3 == 0)
                JOptionPane.showMessageDialog(null, "O valor é múltiplo de 3 :>");
            else
                JOptionPane.showMessageDialog(null, "O valor não é múltiplo de 3 :<");
            c = Integer.parseInt(JOptionPane.showInputDialog("Desaja continuar? (1)Sim (2)Não "));
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notaprovajoao;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class NotaProvaJoao {

    public static void main(String[] args) {
          int n1, m, i = 0, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a a nota da prova: "));
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite a média entre as duas provas: "));
        
        n2 = (2*m - n1);
            JOptionPane.showMessageDialog(null, "A nota da outra prova é = " + n2);
       
    }
}


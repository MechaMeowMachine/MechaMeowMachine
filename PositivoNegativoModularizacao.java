/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.positivonegativomodularizacao;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class PositivoNegativoModularizacao{
    public static void SINAL(int n) {
        if (n > 0)
            JOptionPane.showMessageDialog(null, "POSITIVO");
        if (n < 0)
            JOptionPane.showMessageDialog(null, "NEGATIVO");
        else
            if (n == 0)
                JOptionPane.showMessageDialog(null, "NULO");
    }

    public static void main(String[] args) {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        SINAL(n);
        
    }
}



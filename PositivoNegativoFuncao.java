/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.positivonegativofuncao;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class PositivoNegativoFuncao {
    public static String positivoNegativo(int n) {
       
        if (n > 0)
            return("POSITIVO");
        
        else
            if (n < 0)
                return("NEGATIVO");
        
        else
            return("NULO");
    }

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")
        JOptionPane.showMessageDialog(null, "" + positivoNegativo(num));
    }
}

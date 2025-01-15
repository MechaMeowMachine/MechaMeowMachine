/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.positivonegativo;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class PositivoNegativo {

    public static void main(String[] args) {
        int i;
        double n;
        
        for(i = 1; i <= 100; i++){
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        if (n > 0)
            JOptionPane.showMessageDialog(null, "Positivo");
        else
            if (n < 0)
                JOptionPane.showMessageDialog(null, "Negativo");
        else
            if (n == 0)
                JOptionPane.showMessageDialog(null, "Nulo");
        }
    }  
}



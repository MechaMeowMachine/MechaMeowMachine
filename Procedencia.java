/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.procedencia;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class Procedencia {

    public static void main(String[] args) {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o código de origem: "));
        if (n == 1)
            JOptionPane.showMessageDialog(null, "Sul");
        else
            if (n == 2)
                JOptionPane.showMessageDialog(null, "Norte");
        else
            if (n == 3)
                JOptionPane.showMessageDialog(null, "Leste");
        else
            if (n == 4)
                JOptionPane.showMessageDialog(null, "Oeste");
        else
            if (n == 5 || n == 6)
                JOptionPane.showMessageDialog(null, "Nordeste");
        else
            if (n >= 7 && n <= 9)
                JOptionPane.showMessageDialog(null, "Sudeste");
        else
            if (n >= 10 && n <= 20)
                JOptionPane.showMessageDialog(null, "Centro-Oeste");
        else
            if (n >= 25 && n <= 30)
                JOptionPane.showMessageDialog(null, "Noroeste");
        
                
        
                    
    }
}

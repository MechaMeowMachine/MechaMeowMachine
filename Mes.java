/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mes;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Mes {
    public static void NOME_MES(int n) {
        
        if (n == 1)
            JOptionPane.showMessageDialog(null, "Janeiro");
        else
            if (n == 2)
                JOptionPane.showMessageDialog(null, "Feveriro");
        else
            if (n == 3)
                JOptionPane.showMessageDialog(null, "Março");
        else
            if (n == 4)
                JOptionPane.showMessageDialog(null, "Abril");
        else
            if (n == 5)
                JOptionPane.showMessageDialog(null, "Maio");
        else
            if (n == 6)
                JOptionPane.showMessageDialog(null, "Junho");
        else
            if (n == 7)
                JOptionPane.showMessageDialog(null, "Julho");
        else
            if (n == 8)
                JOptionPane.showMessageDialog(null, "Agosto");
        else
            if (n == 9)
                JOptionPane.showMessageDialog(null, "Setembro");
        else
            if (n == 10)
                JOptionPane.showMessageDialog(null, "Outubro");
        else
            if (n == 11)
                JOptionPane.showMessageDialog(null, "Novembro");
        else
            if (n == 12)
                JOptionPane.showMessageDialog(null, "Dezembro");
        else
            JOptionPane.showMessageDialog(null, "Número inválido");
        }

    public static void main(String[] args) {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 12: "));
        NOME_MES(n);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.categorianadador;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class CategoriaNadador {

    public static void categoria(int i) {
        if (i >= 5 && i <= 7)
            JOptionPane.showMessageDialog(null, "Infantil A");
        else
            if (i >= 8 && i <= 10)
                JOptionPane.showMessageDialog(null, "Infantil B");
        else
            if (i >= 11 && i <= 13)
                JOptionPane.showMessageDialog(null, "Juvenil A");
        else
            if (i >= 14 && i <= 17)
                JOptionPane.showMessageDialog(null, "Juvenil B");
        else
            if (i > 18)
                JOptionPane.showMessageDialog(null, "Adulto");
    }

    public static void main(String[] args) {
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        categoria(idade);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.classificacaoproduto;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class ClassificacaoProduto {

    public static void main(String[] args) {
        int i, c;
        
        for (i = 1; i <= 5; i++){
            c = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));
            if (c == 1)
                JOptionPane.showMessageDialog(null, "Alimento não-perecível");
            else
                if (c == 2 || c == 3)
                    JOptionPane.showMessageDialog(null, "Alimento perecível");
            else
                if (c == 4 || c == 5)
                    JOptionPane.showMessageDialog(null, "Vestuário");
            else
                if (c == 6)
                    JOptionPane.showMessageDialog(null, "Higiene pessoal");
            else
                if (c >= 7 && c <= 10)
                    JOptionPane.showMessageDialog(null, "Limpeza e utensílios domésticos");
            else
                    JOptionPane.showMessageDialog(null, "Inválido");
        }
    }
}


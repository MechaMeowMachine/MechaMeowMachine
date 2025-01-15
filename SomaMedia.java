/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somamedia;
import javax.swing.JOptionPane;
/**
 *
 * @author 2024108060014
 */
public class SomaMedia {

    public static void main(String[] args) {
        
        double x, y, z, w, soma, media;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        z = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));
        w = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número"));
        soma = x + y + z + w;
        media = (soma)/4;
        JOptionPane.showMessageDialog(null, "Soma= " + soma);
        JOptionPane.showMessageDialog(null, "Média = " + media);
    }
}

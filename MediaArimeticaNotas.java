/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaarimeticanotas;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class MediaArimeticaNotas {

    public static void main(String[] args) {
        
        double n1, n2, n3, media;
     
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        media = (n1+n2+n3)/3;
        JOptionPane.showMessageDialog(null, "Média = " + media);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somanumerosmenores20;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class SomaNumerosMenores20 {

  public static void main(String[] args) {
        double v = 1, soma = 0;
        
        while (v != 0){
            v = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            if (v < 20)
                soma = soma + v;
    }
    JOptionPane.showMessageDialog(null, "Soma dos números menores que 20 = " + soma);
}
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiores100;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Maiores100 {

    public static void main(String[] args) {
        double n, soma = 0;
        int c = 1;
        
        while (c == 1){
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        if (n > 100)
            soma = soma + n;
        c = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? (1)Sim (2)Não "));
        }
        JOptionPane.showMessageDialog(null, "Soma dos números maiores que 100 = " + soma);
    }
}


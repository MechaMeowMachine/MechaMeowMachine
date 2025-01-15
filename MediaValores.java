/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediavalores;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class MediaValores {

    public static void main(String[] args) {
        double n, m, s = 0;
        int c = 1, cont = 0;
        
        while (c == 1){
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            s = s + n;
            cont = cont + 1;
            c = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? (1)Sim (2)Não "));
        }
        m = s/cont;
        JOptionPane.showMessageDialog(null, "Média dos valores = " + m);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.anobissexto2;
import javax.swing.JOptionPane;
/**
 *
 * @author 2024108060014
 */
public class AnoBissexto2 {

    public static void main(String[] args) {
        int a, d, c = 1;
        
        while (c == 1){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0)
            JOptionPane.showMessageDialog(null, "O ano é bissexto! ^•ﻌ•^");
        else
            JOptionPane.showMessageDialog(null, "O ano não é bissexto!");
        c = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? (1)Sim (2)Não "));
        }
    }
}


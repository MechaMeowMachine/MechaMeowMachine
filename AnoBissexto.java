/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anobissexto;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class AnoBissexto {

    public static void main(String[] args) {
        int i, ano;
        
        for (i = 1; i <= 5; i++){
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano: "));
        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0)
            JOptionPane.showMessageDialog(null, "O ano é bissexto :3");
        else
            JOptionPane.showMessageDialog(null, "O ano não é bissexto");
       }
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.voto;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class Voto {

    public static void main(String[] args) {
        int i, c = 1;
        
        while (c == 1){
        i = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        if (i == 16 || i == 17)
            JOptionPane.showMessageDialog(null, "Facultativo");
        else
            if (i >= 18 && i <= 65)
                JOptionPane.showMessageDialog(null, "Obrigatório");
        else
           if (i > 65)
               JOptionPane.showMessageDialog(null, "Dispensado");
        c = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? (1)Sim (2)Não "));
        }
    }
}


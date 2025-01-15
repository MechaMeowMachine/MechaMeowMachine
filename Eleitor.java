/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eleitor;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class Eleitor {

    public static void main(String[] args) {
        int i, id;
        
        for (i = 1; i <= 5; i++){
            id = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            if (id == 16 || id == 17)
            JOptionPane.showMessageDialog(null, "Facultativo");
            else
                if (id >= 18 && id <= 65)
                    JOptionPane.showMessageDialog(null, "Obrigatório");
            else
                if (id > 65)
                    JOptionPane.showMessageDialog(null, "Dispensado");
        }
    }
}

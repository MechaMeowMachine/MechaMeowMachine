/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaimpares1_101;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class SomaImpares1_101 {

    public static void main(String[] args) {
        int i, s = 0;
        
        for (i = 1; i <= 101; i++){
            if (i % 2 != 0)
                s = s + i;
        }
        JOptionPane.showMessageDialog(null, "" + s);
    }
}



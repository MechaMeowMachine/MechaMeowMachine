/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hemengarda;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class Hemengarda {

    public static void main(String[] args) {
        int pos = 0, p = 10, s = 3, e = 2, d = 0;
        
        while (pos < p){
            pos = pos + s;
            
            if (pos < p)
                pos = pos - e;
            d = d + 1;
        }
        
        JOptionPane.showMessageDialog(null, "Hemengarda irá demorar " + d + " dias para sair do poço");
    }
}

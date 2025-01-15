/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fahrenheitparacentigrados;
import javax.swing.JOptionPane;
/**
 *
 * @author 2024108060014
 */
public class FahrenheitParaCentigrados {

    public static void main(String[] args) {
        
        double c, f;
        
        f = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Fahrenheit"));
        c = (5.0/9.0) * (f-32);
        JOptionPane.showMessageDialog(null, "Valor em Centígrados" + c);
                
    }
}


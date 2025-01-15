/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valorimparpar;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class ValorImparPar {

    public static void main(String[] args) {
        int i, cont1 = 0, cont2 = 0;
        double n;
        
        for (i = 1; i <= 5; i++){
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um núemero: "));
            if (n % 2 == 0)
                cont1 = cont1 + 1;
            else
                if (n % 2 != 0)
                    cont2 = cont2 + 1;
        }
        JOptionPane.showMessageDialog(null, "Números pares digitados = " + cont1 + "\nNúmeros ímpares digitados: " + cont2);
    }
}



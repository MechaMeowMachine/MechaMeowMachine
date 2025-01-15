/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadoshabitantes;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */
public class DadosHabitantes {

    public static void main(String[] args) {
        int s, corO, corC, i, c = 1, cont = 0;
        
        while(c == 1){
            s = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo: (1)Feminino (2)Masculino"));
            corO = Integer.parseInt(JOptionPane.showInputDialog("Digite a cor dos seus olhos:" + "\n1-Azuis " + "\n2-Verdes" + "\n3-Castanhos"));
            corC = Integer.parseInt(JOptionPane.showInputDialog("Digite a cor dos seus cabelos: " + "\n1-Loiros" + "\n2-Castanhos" + "\n3-Pretos"));
            i = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            
            if (s == 1 && i >= 20 && i <= 40 && corO == 2 && corC == 1)
                cont = cont + 1;
            c = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? (1)Sim (2)Não"));
                
        }
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas do sexo feminino cuja idade está entre 20 e 40 anos e que tenham olhos verdes e cabelos loiros = " + cont);
    }
}


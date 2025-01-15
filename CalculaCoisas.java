/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculacoisas;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024108060014
 */
public class CalculaCoisas {

    public static void main(String[] args) {
        int i, id, s, cont = 0, contM = 0, contF = 0;
        double a, m, si = 0, sa = 0;
        
        for (i = 1; i <= 5; i++){
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        s = Integer.parseInt(JOptionPane.showInputDialog("Digite seu sexo: Feminino(1) Masculino(2) "));
        if (a >= 1.80 && a <= 2.10)
            cont = cont + 1;
        if (s == 2);
        contM = contM + 1;
        sa = sa + a;
        si = si + id;
        if (s == 1 && id < 20)            
            contF = contF + 1;
        }
       m = sa/contM;
       JOptionPane.showMessageDialog(null, "Quantidade de pessoas com altura entre 1,80m e 2,10m = " + cont + "\nMédia arimética das alturas dos homens = " + m + "\nQuantidade de mulheres com menos de 20 anos = " + contF + "\nSoma das idades dos homens = " + si);
       
    }
}


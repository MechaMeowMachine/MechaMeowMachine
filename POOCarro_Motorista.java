/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poocarro_motorista;

/**
 *
 * @author jhull
 */
    public class POOCarro_Motorista {

    public static void main(String[] args) {
        Carro c1 = new Carro("Azul", "Fusca", "Volkswagen Typ", 1973, 20);
        Motorista m1 = new Motorista("Raimundo", "73846384639", "25445", "46673446789", "23/08/1756", c1);
        
        m1.exibir();
        c1.ligar();
        c1.acelerar(10);
        m1.dirigir();
        m1.multa(40, 100);
        c1.freiar();
        
    }
}

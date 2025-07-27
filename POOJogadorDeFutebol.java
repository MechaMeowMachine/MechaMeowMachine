/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poojogadordefutebol;
import java.time.LocalDate;

/**
 *
 * @author jhull
 */
public class POOJogadorDeFutebol {

    public static void main(String[] args) {
        Uniforme u1 = new Uniforme("Branco", "Azul", "Preto", "10");
        JogadorDeFutebol ney = new JogadorDeFutebol("Neymar Junior", LocalDate.of(1992, 02, 05), "Brasileiro", 1.75, 68, "Atacante", u1);
        
        ney.exibir();
    }
}


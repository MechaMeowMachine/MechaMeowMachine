/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturasderepeticao;
import javax.swing.JOptionPane;

/**
 *
 * @author jhull
 */

/* Ex1: public class EstruturasDeRepeticao {

    public static void main(String[] args) {
        int contador = 50;
        
        while (contador <= 80) {
            System.out.println(contador);
            contador += 2;
        }
    }
} */

/* Ex2:
// Define uma classe pública chamada EstruturasDeRepeticao
public class EstruturasDeRepeticao {

    // O método main é o ponto de entrada do programa
    public static void main(String[] args) {
        // Declara uma variável inteira chamada contador e a inicializa com 0
        int contador = 0;
        
        // Inicia um loop while que continua enquanto contador for menor que 3
        while (contador < 3) {
            // Exibe uma caixa de diálogo com a mensagem "Olá"
            System.out.println("Olá");
            // Incrementa a variável contador em 1
            contador++;
        }
    }
} */

/* Ex3:
public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        int contador = 1;
        
        while (contador <= 100) {
            System.out.println(contador);
            contador++;
        }
    }
} */

/* Ex4:
public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        int contador = 400;
        
        while (contador >= 300) {
            System.out.println(contador);
            contador--;
        }
        
    }
} */

/* Ex5:
public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        int contador = 299;
        
        do {
            System.out.println(contador);
            contador--;
        } while (contador>= 300);

    }
} */

/* Ex:5.1
public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        int contador = 299;
        
        while (contador >= 300) {
            System.out.println(contador);
            contador--;
        }
        
    }
} */

/* Ex6:
public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        
        for(int contador = 1; contador <= 100; contador++) {
            System.out.println(contador);
        }
        
    }
} */

/* Ex6.1:
public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        
        for(int contador = 1; contador <= 100; contador--) {
            System.out.println(contador);
        }
        
    }
} */

/* Ex6.2:
public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        
        for(int contador = 1; contador <= 100; contador-=2) {
            System.out.println(contador);
        }
        
    }
} */

public class EstruturasDeRepeticao {
    
    public static void main(String[] args) {
        
        for(int contador = 100; contador >= 0; contador--) {
            System.out.println(contador);
        }
    }
}





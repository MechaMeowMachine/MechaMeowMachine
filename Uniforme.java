/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poojogadordefutebol;

/**
 *
 * @author jhull
 */
public class Uniforme {
    
    private String corcalcao;
    private String corcamiseta;
    private String meiao;
    private String numero;

    public Uniforme(String corcalcao, String corcamiseta, String meiao, String numero) {
        this.corcalcao = corcalcao;
        this.corcamiseta = corcamiseta;
        this.meiao = meiao;
        this.numero = numero;
    }

    public String getCorcalcao() {
        return corcalcao;
    }

    public String getCorcamiseta() {
        return corcamiseta;
    }

    public String getMeiao() {
        return meiao;
    }

    public String getNumero() {
        return numero;
    }

    public void setCorcalcao(String corcalcao) {
        this.corcalcao = corcalcao;
    }

    public void setCorcamiseta(String corcamiseta) {
        this.corcamiseta = corcamiseta;
    }

    public void setMeiao(String meiao) {
        this.meiao = meiao;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
}


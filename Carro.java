/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poocarro_motorista;

/**
 *
 * @author jhull
 */
public class Carro {
    
    private String cor;
    private String modelo;
    private String marca;
    private int ano;
    private double velociade;

    public Carro(String cor, String modelo, String marca, int ano, double velociade) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velociade = velociade;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getVelociade() {
        return velociade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelociade(double velociade) {
        this.velociade = velociade;
    }

    public void ligar(){
        
            System.out.println("Carro ligado");
        
    }
    
    public void acelerar(double v){
        
        this.setVelociade(this.getVelociade() + v);
        System.out.println("Velocidade atual: " + this.getVelociade());
    }
    
    public void freiar(){
        
        while(this.getVelociade() > 0){
            this.setVelociade(this.getVelociade() - 1);
        }
        
        System.out.println("Velociade atual: " + this.getVelociade());
    
    }
}

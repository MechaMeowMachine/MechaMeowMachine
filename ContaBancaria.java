/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poocontabancaria;

/**
 *
 * @author jhull
 */

public class ContaBancaria {
    
    private String titular;
    private String banco;
    private String agencia;
    private String conta;
    private String operacao;
    private double saldo;

    public ContaBancaria(String titular, String banco, String agencia, String conta, String operacao, double saldo) {
        this.titular = titular;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.operacao = operacao;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getBanco() {
        return banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public String getOperacao() {
        return operacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public void consultar(){
        
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    public void depositar(double d){
        
        this.setSaldo(this.getSaldo() + d);
        System.out.println("Deposito: " + d + "\nSaldo: " + this.getSaldo());
    }
    
public void transferir(ContaBancaria recebedor, double t){
        
        if (t <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - t);
            recebedor.setSaldo(recebedor.getSaldo() + t);
            System.out.println("Tranferencia realizada com sucesso");
        }
        else
            System.out.println("Saldo insuficiente para transferência");
    }    
    public void sacar(double s){
        
        if (s <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - s);
            System.out.println("Saque: " + s + "\nSaldo: " + this.getSaldo());
        }
    }
    
    public void exibir(){
        
        System.out.println("\nTitular: " + this.getTitular() + "\nBanco: " + this.getBanco() + "\nAgencia: " + this.getAgencia() + "\nConta: " + this.getConta() + "\nOperacao: " + this.getOperacao() + "\nSaldo: " + this.getSaldo());
    }
}


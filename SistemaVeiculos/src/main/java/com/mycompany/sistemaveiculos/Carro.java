/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaveiculos;

/**
 *
 * @author joao_arthur-santos
 */
public class Carro extends Veiculo {

    private int numPortas;

    public Carro(String marca, String modelo, int ano, int velocidade, int numPortas) {
        super(marca, modelo, ano, velocidade);
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void acelerar() {
        velocidade++;
        System.out.println("O carro está Acelerando!");
    }

    public void abrirPortas() {
        System.out.println("O carro está abrindo as portas!");
    }

}

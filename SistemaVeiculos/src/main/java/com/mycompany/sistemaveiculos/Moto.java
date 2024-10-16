/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaveiculos;

/**
 *
 * @author joao_arthur-santos
 */
public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int velocidade, int cilindradas) {
        super(marca, modelo, ano, velocidade);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        velocidade++;
        System.out.println("A moto está fazendo RAMPAMPAMPAM!");
    }

    public void cortarGiro() {
        System.out.println("BOLOLO! BOLOLO!");
    }

}

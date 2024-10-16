/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaveiculos;

/**
 *
 * @author joao_arthur-santos
 */
public class Bicicleta extends Veiculo {

    private int aro;

    public Bicicleta(String marca, String modelo, int ano, int velocidade, int aro) {
        super(marca, modelo, ano, velocidade);
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public void acelerar() {
        velocidade++;
        System.out.println("A bicicleta está pedalando!");
    }

    public void trocarMarcha() {
        System.out.println("A bicicleta está trocando de marcha");
    }

}

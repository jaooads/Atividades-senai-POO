/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaiszoologico;

/**
 *
 * @author joao_arthur-santos
 */
public class Vaca extends Animal {

    private String raca;

    public Vaca(String nome, String especie, int idade, String dieta, boolean statusSaude, String cor) {
        super(nome, especie, idade, dieta, statusSaude);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Muu Muu");
    }

    @Override
    public void alimentar(String comida) {
        comida = "Grama";
        if (comida == dieta) {
            statusSaude = true;
        } else {
            statusSaude = false;
        }
    }

}

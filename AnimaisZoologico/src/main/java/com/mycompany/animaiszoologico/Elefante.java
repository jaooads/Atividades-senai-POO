/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaiszoologico;

/**
 *
 * @author joao_arthur-santos
 */
public class Elefante extends Animal {

    private String trompa;

    public Elefante(String nome, String especie, int idade, String dieta, boolean statusSaude, String trompa) {
        super(nome, especie, idade, dieta, statusSaude);
    }

    public String getTrompa() {
        return trompa;
    }

    public void setTrompa(String trompa) {
        this.trompa = trompa;
    }

    @Override
    public void emitirSom() {
        System.out.println("Umm");
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

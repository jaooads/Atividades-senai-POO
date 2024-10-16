/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02;

import java.time.LocalDate;

/**
 *
 * @author joao_arthur-santos
 */
public class Alunos {

    public String nome;
    public String CPF;
    public String matricula;
    public LocalDate dataDeNascimento;
    public String email;
    public double notaAvaliacao1;
    public double notaAvaliacao2;
    public double notaAvaliacao3;

    // Métodos
    public void calcularMedia() {
        double med = (notaAvaliacao1 + notaAvaliacao2 + notaAvaliacao3) / 3;
        System.out.println("Sua média foi: " + med);
    }

    public void detalhesAlunos() {
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu CPF é: " + CPF);
    }
}

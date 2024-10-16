/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade02;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author joao_arthur-santos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Instanciar(criar objeto apartir da classe) um novo objeto do tipo Carro
        Alunos alunos1 = new Alunos();

        alunos1.nome = "Joao";
        alunos1.CPF = "105.134.211.95";
        alunos1.matricula = "00001";
        alunos1.dataDeNascimento = LocalDate.of(2006, Month.MARCH, 10);
        alunos1.email = "joaozinho@gmail.com";
        alunos1.notaAvaliacao1 = 10;
        alunos1.notaAvaliacao2 = 10;
        alunos1.notaAvaliacao3 = 10;

        // Métodos
        alunos1.calcularMedia();
        alunos1.detalhesAlunos();
        //Instanciar(criar objeto apartir da classe) um novo objeto do tipo Carro
        Alunos alunos2 = new Alunos();

        alunos1.nome = "Charlotte";
        alunos1.CPF = "102.202.219.21";
        alunos1.matricula = "00002";
        alunos1.dataDeNascimento = LocalDate.of(2005, Month.SEPTEMBER, 12);
        alunos1.email = "charcha@gmail.com";
        alunos1.notaAvaliacao1 = 9;
        alunos1.notaAvaliacao2 = 9;
        alunos1.notaAvaliacao3 = 9;

        // Métodos
        alunos1.calcularMedia();
        alunos1.detalhesAlunos();

    }

}

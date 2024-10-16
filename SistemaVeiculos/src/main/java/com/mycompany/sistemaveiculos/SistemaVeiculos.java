/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemaveiculos;

/**
 *
 * @author joao_arthur-santos
 */
public class SistemaVeiculos {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", "X1", 2012, 50, 4);

        carro1.acelerar();
        carro1.abrirPortas();

        Moto moto1 = new Moto("Honda", "CG 160", 2023, 50, 160);

        moto1.acelerar();
        moto1.cortarGiro();

        Bicicleta bicicleta1 = new Bicicleta("CALOI", "EXPLORER", 2018, 22, 29);

        bicicleta1.acelerar();
        bicicleta1.trocarMarcha();
    }
}

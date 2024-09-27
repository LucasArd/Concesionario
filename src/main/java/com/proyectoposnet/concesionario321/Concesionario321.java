/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectoposnet.concesionario321;

/**
 *
 * @author luqas
 */
public class Concesionario321 {

    public static void main(String[] args) {
        
        Concesionario concesionario = new Concesionario("San Carlos");
        
        concesionario.listarAutos();
        
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();
        Auto auto4 = new Auto();
        
        concesionario.agregarAuto(auto1);
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectoposnet.concesionario321;

/**
 *
 * @author luqas
 */
public class Concesionario321 { //LOS CONSTRUCTORES NO SE HEREDAN

    public static void main(String[] args) {
        
        Concesionario concesionario = new Concesionario("San Carlos");
        
        concesionario.listarVehiculos();
        
        Auto auto1 = new Auto("Fiat", "Palio", "456CBD");
        Auto auto2 = new Auto("BMW", "CC3", "456CBD");
        Auto auto3 = new Auto("Wolvagen", "Corsa", "456CBD");
        Auto auto4 = new Auto("Honda", "YIYI", "456CBD");
        
        
        Moto moto1 = new Moto("Honda", "CR3", "456CLD");
        Moto moto2 = new Moto("Suzuki", "KI", "555PPO");
        Moto moto3 = new Moto("Yamaha", "element", "321KLD");
        
        
     
        concesionario.agregarVehiculo(auto1);
        concesionario.agregarVehiculo(auto2);
        concesionario.agregarVehiculo(auto3);
        concesionario.agregarVehiculo(moto1);
        concesionario.agregarVehiculo(moto2);
        concesionario.agregarVehiculo(moto3);
        concesionario.agregarVehiculo(auto4);
        
    
        //concesionario.listarVehiculos();
        
        concesionario.ListarAutos();
        concesionario.ListarMotos();
        
        
        System.out.println("Cantidad de vehiculos estacionados " + concesionario.cantidadVehiculos());

    }
}

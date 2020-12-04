/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

/**
 *
 * @author ColdHeart
 */
public class main {
    public static void main(String args[]){
        Deportivo dep1 = new Deportivo(2000, "ABC123", "Camaro", "2021", "Negro", 1200, true);
        Furgoneta fur1 = new Furgoneta(1400, 50, "BCD234", "Foton", "2020", "Blanco", 750, true);
        Turismo tur1 = new Turismo(5, true, "CDE345", "Chevrolet", "2020", "Morado", 680, true);

        Cliente cli1 = new Cliente("10775827", "Jorge", "Quintero");
        Cliente cli2 = new Cliente("50929006", "Martha", "Sáenz");
        Cliente cli3 = new Cliente("1003432242", "Elías", "Tamayo");
        
        EmpresaAlquilerVehiculos Cabi = new EmpresaAlquilerVehiculos("168345654-2", "JQ Rent", "www.jqrent.com");
        
        Cabi.registrarCliente(cli1);
        Cabi.registrarCliente(cli2);
        Cabi.registrarCliente(cli3);
        Cabi.registrarVehiculo(dep1);
        Cabi.registrarVehiculo(fur1);
        Cabi.registrarVehiculo(tur1);
        
        Cabi.imprimirCliente();
        Cabi.imprimirVehiculos();
        
        System.out.println("Cliente Existe:"+String.valueOf(Cabi.getCliente("50929006")));
    }
}

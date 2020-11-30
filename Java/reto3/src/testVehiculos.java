
package testClaseLunes;


public class testVehiculos 
{
    // psvm seguido de la tecla Tab
    public static void main(String[] args) 
    {
        // instancia del objeto vehiculo1 de la clase vehiculos
        Vehiculos vehiculo1 = new Vehiculos("EFV123", "TOYOTA",
        "TOY234", "BLANCO", 100.0);
        
        // soutv seguido de la tecla Tab
        System.out.println("vehiculo1 = " + vehiculo1.getAtributos());
        System.out.println("vehiculo1 = " + vehiculo1.getMatricula());

    }
}

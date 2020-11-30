
package testClaseLunes;
public class TestAlquiler 
{
    public static void main(String[] args) 
    {
        // Instancia objeto Vehiculo1 de la clase Vehiculos
        Vehiculos vehiculo1 = new Vehiculos("EFV123", "TOYOTA",
        "TOY234", "NEGRO", 100.0);
        // Instancia objeto cliente1 de la clase Cliente
        Cliente cliente1 = new Cliente ("id123456789", "Daniel", "Ramirez");
        // Ejemplo día del alquiler
        // alquiler 22/11/2020 durante 2 días
        // Instancia Alquiler1 de la clase VehiculoAlquilado
        VehiculoAlquilado Alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1,
                22, 11, 2020, 2); 
        System.out.println("Alquiler1 = " + Alquiler1.getClientes().getNombre());
        System.out.println("Alquiler1 = " + Alquiler1.getVehiculo().getAtributos());
        System.out.println("Alquiler1 = " + Alquiler1.getTotalDiasAlquiler());
    }
}

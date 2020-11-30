
package testClaseLunes;

// la clase Deportivo es una subclase heredada de la clase Vehiculos
public class Deportivo extends Vehiculos
{
    // atributos subclase Deportivo
    private int cilidrada;
    // método constructor de la subclase Deportivo
    public Deportivo(int cilidrada, 
            String matricula, 
            String marca,
            String modelo, 
            String color,
            double tarifa) 
    {
        // inicializar los atributos de la clase padre usando super
        super(matricula, marca, modelo, color, tarifa);
        // inicialización atributos clase hija
        this.cilidrada = cilidrada;
    }
    // método para visualizar desde la clase principal 
    // el atributo cilindrada del objeto instanciado desde la subclase
    // Deportiva
    public int getCilidrada() {
        return cilidrada;
    }
    // método para visualizar desde la clase principal 
    // todos los atributos que componen la clase padre y la clase hija Deportivo
    @Override
    public String getAtributos() {
        return super.getAtributos() + 
                " Cilindraje: " + this.cilidrada + " "; //To change body of generated methods, choose Tools | Templates.
    }  
}


package testClaseLunes;


public class Vehiculos 
{
    // atributos
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    
    //metodo constructor

    public Vehiculos(String matricula, 
                     String marca, 
                     String modelo,
                     String color,
                     double tarifa) 
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
    // método para visualizar desde la clase principal 
    // el atributo matricula del vehiculo de un objeto instanciado 
    public String getMatricula() 
    {
        return matricula;
    }
    // método para visualizar desde la clase principal 
    // el atributo marca del vehiculo de un objeto instanciado 

    public String getMarca() {
        return marca;
    }
    // método para visualizar desde la clase principal 
    // el atributo color del vehiculo de un objeto instanciado 
    public String getColor() {
        return color;
    }
    // método para visualizar desde la clase principal 
    // el atributo modelo del vehiculo de un objeto instanciado 

    public String getModelo() {
        return modelo;
    }
    // método para modificar desde la clase principal 
    // el atributo tarifa del vehiculo de un objeto instanciado 

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    // método para modificar desde la clase principal 
    // el atributo Disponible del vehiculo de un objeto instanciado 
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    // método para visualizar desde la clase principal 
    // todos los atributos que componen la clase vehiculos 
    public String getAtributos()
    {
        return "Matricula: " + this.matricula + " " +
                "Color: " + this.color + " " +
                "Modelo: " + this.modelo + " " +
                "tarifa: " + this.tarifa + " " +
                "disponible: " + this.disponible;
    }
}

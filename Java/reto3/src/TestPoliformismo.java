
package testClaseLunes;


public class TestPoliformismo 
{
    public static void main(String[] args) 
    {
        // Instancia objeto turismo1 de la subclase Turismo
        Turismo turismo1 = new Turismo(5, false, "EFV123", "TOYOTA","TOY234",
                "NEGRO", 100.0);
        // Instancia objeto Furgoneta1 de la subclase Furgoneta
        Furgoneta Furgoneta1 = new Furgoneta(1200, 8, "EFV856", "RENAUT","AVEOFAMILY",
                "ROJO", 80.0);
        System.out.println("turismo1 = " + turismo1.getAtributos());
        Furgoneta1.setDisponible(true);
        System.out.println("Furgoneta1 = " + Furgoneta1.getAtributos());
    }
}
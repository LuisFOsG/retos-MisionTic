package program;

import java.util.Iterator;
import org.json.simple.JSONArray;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author ColdHeart
 */
public class menu {

    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        JSONObject data = leerTxt("departamento.json");
        encapsularDatos(data);
    }

    public static JSONObject leerTxt(String direccion){
        JSONObject config = null;
        try{
            JSONParser parser = new JSONParser();
            Object object =  parser.parse(new FileReader(direccion));
            config = (JSONObject) object;
        } catch (Exception e) {
            System.out.println("Excepcion leyendo fichero de configuracion " + e);
        }
        return config;
    }

    public static void encapsularDatos(JSONObject config){

        String nombreDep = (String) config.get("Nombre");
        JSONArray departamento = (JSONArray) config.get("Municipios");
        
        Iterator<JSONObject> iterador_depart = departamento.iterator();
        List<Municipio> municipio = new ArrayList<>();
        
        while(iterador_depart.hasNext()){
            List<Barrio> barr = new ArrayList<>();
            List<Vereda> verr = new ArrayList<>();

            JSONObject arrMunicipio = iterador_depart.next();
            String nom_mun = (String) arrMunicipio.get("Nombre");
            
            System.out.println(nom_mun);
            System.out.println(nombreDep);
            System.out.println("=============================");

            JSONArray barrios = (JSONArray) arrMunicipio.get("Barrios");
            Iterator<JSONObject> iterador_barrios = barrios.iterator();
            while(iterador_barrios.hasNext()){
                JSONObject arrBarrios = iterador_barrios.next();
                String nombreHabitante = (String) arrBarrios.get("Nombre");
                String nivelEscolar = (String) arrBarrios.get("NivelEscolar");
                String cedula = (String) arrBarrios.get("Cedula");
                long edad = (long) arrBarrios.get("Edad");
                long ingreso = (long) arrBarrios.get("Ingresos");
                long salidasNocturnas = (long) arrBarrios.get("Salidas Nocturnas");
                System.out.println(nombreHabitante);
                System.out.println(nivelEscolar);
                System.out.println(cedula);
                System.out.println(edad);
                System.out.println(ingreso);
                System.out.println(salidasNocturnas);
                System.out.println("=============================");
            }
            
            JSONArray veredas = (JSONArray) arrMunicipio.get("Veredas");
            Iterator<JSONObject> iterador_veredas = veredas.iterator();
            while(iterador_veredas.hasNext()){
                JSONObject arrVeredas = iterador_veredas.next();
                String nombreHabitante = (String) arrVeredas.get("Nombre");
                String nivelEscolar = (String) arrVeredas.get("NivelEscolar");
                String cedula = (String) arrVeredas.get("Cedula");
                long edad = (long) arrVeredas.get("Edad");
                long ingreso = (long) arrVeredas.get("Ingresos");
                String cultivo = (String) arrVeredas.get("Cultivos");
                System.out.println(nombreHabitante);
                System.out.println(nivelEscolar);
                System.out.println(cedula);
                System.out.println(edad);
                System.out.println(ingreso);
                System.out.println(cultivo);
                System.out.println("=============================");
            }
        }
    }
}

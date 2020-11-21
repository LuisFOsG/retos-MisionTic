package program;

import java.util.Iterator;
import org.json.simple.JSONArray;
import java.io.FileReader;
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
        Municipio[] munc = new Municipio[10];
        
        while(iterador_depart.hasNext()){
            Barrio[] barr = new Barrio[10];
            Vereda[] verr = new Vereda[10];

            JSONObject arrMunicipio = iterador_depart.next();
            String nom_d = (String) arrMunicipio.get("Nombre");

            JSONArray barrios = (JSONArray) arrMunicipio.get("Barrios");
            Iterator<JSONObject> iterador_barrios = barrios.iterator();
            while(iterador_barrios.hasNext()){
                JSONObject arrBarrios = iterador_barrios.next();
                String nombreHabitante = (String) arrBarrios.get("Nombre");
                
                System.out.println(nombreHabitante);
            }
            
            JSONArray veredas = (JSONArray) arrMunicipio.get("Veredas");
            Iterator<JSONObject> iterador_veredas = veredas.iterator();
            while(iterador_veredas.hasNext()){
                Cultivos[] cult = new Cultivos[10];

                JSONObject arrVeredas = iterador_veredas.next();
                String nombreHabitante = (String) arrVeredas.get("Nombre");
                JSONArray cultivos = (JSONArray) arrVeredas.get("Cultivos");
                
                System.out.println(nombreHabitante);
                System.out.println(cultivos);
            }
            
            System.out.println(nom_d);
            System.out.println(barrios);
            System.out.println(veredas);
        }
    }
}

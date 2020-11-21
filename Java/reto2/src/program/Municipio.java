/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.List;

/**
 *
 * @author ColdHeart
 */
public class Municipio {
    String Nombre;
    List<Persona> personas;

    public Municipio(String Nombre, List<Persona> personas) {
        this.Nombre = Nombre;
        this.personas = personas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
}

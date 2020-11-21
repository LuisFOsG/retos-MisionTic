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
public class Persona {
    long cedula;
    String nombrePersona;
    int edad;
    String NivelEscolar;
    boolean trabaja;
    long ingreso;
    List<Barrio> barrio;
    List<Vereda> vereda;

    public Persona(long cedula, String nombrePersona, int edad, String NivelEscolar, boolean trabaja, long ingreso, List<Barrio> barrio, List<Vereda> vereda) {
        this.cedula = cedula;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.NivelEscolar = NivelEscolar;
        this.trabaja = trabaja;
        this.ingreso = ingreso;
        this.barrio = barrio;
        this.vereda = vereda;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivelEscolar() {
        return NivelEscolar;
    }

    public void setNivelEscolar(String NivelEscolar) {
        this.NivelEscolar = NivelEscolar;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    public long getIngreso() {
        return ingreso;
    }

    public void setIngreso(long ingreso) {
        this.ingreso = ingreso;
    }

    public List<Barrio> getBarrio() {
        return barrio;
    }

    public void setBarrio(List<Barrio> barrio) {
        this.barrio = barrio;
    }

    public List<Vereda> getVereda() {
        return vereda;
    }

    public void setVereda(List<Vereda> vereda) {
        this.vereda = vereda;
    }
    
}

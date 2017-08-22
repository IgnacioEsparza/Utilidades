/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JsonPackage;



/**
 *
 * @author Ignacio
 */
public class Persona {
     int edad;
     String rut;
     Ciudadresidencia cr;

    public Persona(int edad, String rut, Ciudadresidencia cr) {
        this.edad = edad;
        this.rut = rut;
        this.cr = cr;
    }

    public int getEdad() {
        return edad;
    }

    public String getRut() {
        return rut;
    }

    public Ciudadresidencia getCr() {
        return cr;
    }
    

    @Override
    public String toString() {
        return "Edad = " + edad + ", Rut = " + rut + ", Ciudad Residencia :" + cr;
    }
     
}

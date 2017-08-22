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
public class Ciudadresidencia {
   int codigo;
   String nombre;

    public Ciudadresidencia() {
    }
   
    public Ciudadresidencia(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    @Override
    public String toString() {
        return " Código = " + codigo + ", Nombre = " + nombre;
    }
    
}

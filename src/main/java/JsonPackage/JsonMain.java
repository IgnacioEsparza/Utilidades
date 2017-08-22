/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JsonPackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Ignacio
 */
public class JsonMain {

    public static void main(String[] args) {
        Persona p = new Persona(99, "190591689", new Ciudadresidencia(8, "VillaTauro"));
        //ajson(p);
        ajava();
    }

    public static void ajson(Persona p) {
        System.out.println("En JSON");
        Gson gson = new Gson();
        String enJson = gson.toJson(p);
        GuardarJSON g = new GuardarJSON();
        g.registro(enJson);
        System.out.println("Texto en Formato JSON de los alumnos agregados:n" + enJson);
    }

    public static void ajava() {
        Gson g = new Gson();
        BufferedReader br = null;
        Type listpersona = new TypeToken<ArrayList<Persona>>(){}.getType();
        try {
            br = new BufferedReader(new FileReader("json.xml"));
            Persona p = g.fromJson(br,listpersona);
            System.out.println("---\nEdad: " + p.getEdad() + "\nRut: " + p.getRut()
                    + "\nCiudad: " + p.getCr().getNombre() + "\nCódigo Ciudad: " + p.getCr().getCodigo());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

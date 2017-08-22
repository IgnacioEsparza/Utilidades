/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JsonPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Ignacio
 */
public class GuardarJSON {

    public GuardarJSON() {
    }
    
     public void registro(String registro) {

        try {

            File txt = new File("json.xml");
            FileWriter fw;
            BufferedWriter bw;
            if (txt.exists()) {
                fw = new FileWriter(txt);
                bw = new BufferedWriter(fw);
                
                bw.write(registro);
                //bw.write("{PerJson:"+registro+"}");
            } else {
                fw = new FileWriter(txt);
                bw = new BufferedWriter(fw);
                bw.write(registro);
                //bw.write("{PerJson:"+registro+"}");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}

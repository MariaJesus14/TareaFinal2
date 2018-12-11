/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class Validator {

    public static Boolean toCheck(String User, String Password){
            try {
        File file;
        FileReader fr=null;
        BufferedReader br= null;
        file = new File("userFile.txt");
        String datos[];
             String line;
             fr= new FileReader(file);
             br= new BufferedReader(fr);
             while ((line=br.readLine())!=null) {
                 datos = line.split("-");
                 if(User.equals(datos[0])&& Password.equals(datos[1])){

               return true;
                 }
        }

            fr.close(); 
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
         
        }
            return false;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import user.User;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class WriterManager {

    private BufferedWriter writer;

 /**
 *open se encarga de abrir el archivo de texto
 * @param recibe un string por parametros
 * @return es void por lo tanto  no retorna 
 * 
 */ 
    
    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName,true));
    }
    
 /**
 *read se encarga de escribir el archivo de texto
 * @param recibe al usuario por parametros
 * @return es void entonces no retorna
 * 
 */


    public void write(User user) throws IOException {
        writer.write(user.toFileString()+"\r\n" ); 
    }
    
 /**
 *close se encarga de cerrar el archivo de texto
 * @param no recibe parametros
 * @return es void por lo tanto no retorna
 * 
 */

    public void close() throws IOException {
        writer.close();
    }
}

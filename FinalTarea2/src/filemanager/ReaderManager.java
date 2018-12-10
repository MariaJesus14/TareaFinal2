/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
import user.User;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderManager {

    private BufferedReader reader;

 /**
 *open se encarga de abrir el archivo de texto
 * @param recibe un string por parametros
 * @return es void por lo tanto  no retorna 
 * 
 */
    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }
 /**
 *read se encarga de abrir el archivo de texto
 * @param no recibe parametros
 * @return retorna el usuario 
 * 
 */

    public User read() throws IOException {
        User user = null;
        String line = reader.readLine();
        String[] data;

        
        if (line != null) {
            user = new User();
            data = line.split("-");
            user.setUsername(data[0]); 
            user.setPassword(data[1]); 
            
        }
        return user;
    }
 /**
 *close se encarga de cerrar el archivo de texto
 * @param no recibe parametros
 * @return es void por lo tanto no retorna
 * 
 */

    public void close() throws IOException {
        reader.close();
    }
}

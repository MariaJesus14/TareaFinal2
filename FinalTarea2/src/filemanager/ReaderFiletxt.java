/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;


import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.CrossWord;
import model.Word;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class ReaderFiletxt {
    int column;
    int row;

    String level1 = "files/level1/1.txt";
    
 /**
 *readFileEasy inicia el juego segun la dificultad escogida por el usuario
 * @param recibe un numero entero por parametros
 * @return es void por lo tanto  no retorna 
 * 
 */

    public CrossWord readFileEasy(String root, int lengArray) throws IOException {
        String[][] matrixEasy;
        String[] file = loadFile(root, lengArray);
        System.out.println("FILE LENGHT = "+file.length);
        String[] words;
        Word[] listWord = new Word[file.length-1];
        int var =0;
        
         row = Character.getNumericValue(file[0].charAt(0));
         column = Character.getNumericValue(file[0].charAt(2)); 
        
        for (int i = 1; i < file.length-1; i++, var++) {
            words = file[i].split("/");
            System.out.println("VAR = "+var);
            listWord[var] = new Word(Character.getNumericValue(words[0].charAt(0)), Character.getNumericValue(words[0].charAt(2)), Integer.parseInt(words[1]), words[2], words[3], words[4]);
        }
        CrossWord cross = new CrossWord(row, column, listWord);
        return cross;
    }
    
 
    public String[] loadFile(String rootFile, int lengArray) throws FileNotFoundException, IOException {
        String cadena;
        int contador = 0;
        String[] arrayFile;
        FileReader file = new FileReader(rootFile);
        BufferedReader buffer = new BufferedReader(file);
        arrayFile = new String[lengArray+1];
        while ((cadena = buffer.readLine()) != null) {
            System.out.println(""+contador);
            arrayFile[contador] = cadena;
            contador++;
        }
        buffer.close();
        return arrayFile;
    }
    private void creatMatrix (){
        GridLayout grid = new GridLayout();
        grid.setColumns(column);
    }
}

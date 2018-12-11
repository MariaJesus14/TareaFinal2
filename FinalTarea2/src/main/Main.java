/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dataset.LogicGame;
import filemanager.ReaderFiletxt;
import java.io.IOException;
import view.Start;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ReaderFiletxt reader = new ReaderFiletxt();
        LogicGame.makeMatrix(reader.readFileEasy("files/level1/1.txt", 8));
        System.out.println(""+LogicGame.printMatrix(LogicGame.makeMatrix(reader.readFileEasy("files/level1/1.txt", 8))));
         Start star = new Start ();
         star.setVisible(true);
    }
    
}

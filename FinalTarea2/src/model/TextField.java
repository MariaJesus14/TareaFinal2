/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import filemanager.ReaderFiletxt;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class TextField extends JTextField {
    ReaderFiletxt reader = new ReaderFiletxt();
   
    private int [][] datos;
    
    public void setColorWhite() {
        setBackground(Color.white);
        setEditable(true);
    }
    public void setColorBlack (){
        setBackground(Color.black);
        setEditable(false);
    }
    
  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class GestorEs {
 /**
 *mostrarMensaje es un metodo usado para mostrar los mensajes al usuario
 * @param recibe el mensaje por parametros
 * @return es void por lo tanto no retorna
 * 
 */
   public static void mostrarMensaje (String mensaje){
       JOptionPane.showMessageDialog(null, mensaje);
   }
 /**
 *pedirEntero es un metodo que le pide enteros al usuario
 * @param recibe el mensaje por parametros
 * @return retorna el entero recibido
 * 
 */
   
   public int pedirEntero (String mensaje){
       int entero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
       return entero;
   }
 /**
 *pedirString es el metodo que le pide un string al usuario
 * @param recibe el mensaje por parametros
 * @return retorna el string recibido
 * 
 */
   
   public String pedirString (String mensaje){
       String string = JOptionPane.showInputDialog(mensaje);
       return string;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Usuario
 */
public class JustCapital_OneChar extends PlainDocument{
    private JTextField editor;
    private int num;
    
    public  JustCapital_OneChar (JTextField editor, int num){
        this.editor=editor;
        this.num=num;
    }
    
    @Override
    public void insertString (int offset, String str, AttributeSet atr) throws BadLocationException{
       
        if ((editor.getText().length()+str.length())> this.num ){
            return;
            
        }else{
             super.insertString(offset, str.toUpperCase(), atr);
        }
    }
    
  public  static void JustLetters (JTextField a ){
       a.addKeyListener(new KeyAdapter() {
           public void keyTyped (KeyEvent e) {
           char c = e.getKeyChar();
               if (Character.isDigit(c)) {
                   e.consume();
               }
           }
       });
     }
  
}

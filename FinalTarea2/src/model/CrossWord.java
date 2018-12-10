/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */

public class CrossWord {
 /**
 *CrossWord metodo constructor que inicializa la clase
 * @param recibe las filas, columnas, y un vector de palabras
 * @return inicailiza 
 * 
 */

    public CrossWord(int rows, int columns, Word[] arrayWord) {
        this.rows = rows;
        this.columns = columns;
        this.arrayWord = arrayWord;
    }
 /**
 *getRows metodo que obtiene las filas
 * @param no recibe parametros
 * @return las filas  
 * 
 */    

    public int getRows() {
        return rows;
    }
 /**
 *setRows metodo que asigna las filas
 * @param recibe el numero de filas
 * @return es void por lo tanto no retorna
 * 
 */   
    public void setRows(int rows) {
        this.rows = rows;
    }
 /**
 *getColumns metodo que obtiene las columnas
 * @param no recibe parametros
 * @return las columnas  
 * 
 */   
    public int getColumns() {
        return columns;
    }
 /**
 *setColumns metodo que asigna las columnas
 * @param recibe el numero de columnas
 * @return es void por lo tanto no retorna
 * 
 */  
    public void setColumns(int columns) {
        this.columns = columns;
    }
 /**
 *getArrayWord metodo que obtiene el arreglo de palanras
 * @param no recibe parametros
 * @return el arreglo de palabras
 * 
 */ 
    public Word[] getArrayWord() {
        return arrayWord;
    }
 /**
 *setArrayWord metodo que asigna lel arreglo de palabras
 * @param recibe el arreglo de palabras
 * @return es void por lo tanto no retorna
 * 
 */ 

    public void setArrayWord(Word[] arrayWord) {
        this.arrayWord = arrayWord;
    }
 /**
 *toString metodo que imprime los datos
 * @param no recibe parametros
 * @return retorna los datos
 * 
 */ 
    @Override
    public String toString() {
        return "CrossWord{" + "rows=" + rows + ", columns=" + columns + ", arrayWord=" + arrayWord + '}';
    }
    
    private int rows;
    private int columns;
    private Word[] arrayWord;
    
}

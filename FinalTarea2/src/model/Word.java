
package model;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */



public class Word {

    public Word(int row, int column, int numberWord, String orientation, String lettler, String wordHelp) {
        this.row = row;
        this.column = column;
        this.numberWord = numberWord;
        this.orientation = orientation;
        this.Word = lettler;
        this.wordHelp = wordHelp;
    }

   
 /**
 *getRows metodo que obtiene las filas
 * @param no recibe parametros
 * @return las filas  
 * 
 */  
    public int getRow() {
        return row;
    }
 /**
 *setRows metodo que asigna las filas
 * @param recibe el numero de filas
 * @return es void por lo tanto no retorna
 * 
 */ 
    public void setRow(int row) {
        this.row = row;
    }
 /**
 *getColumns metodo que obtiene las columnas
 * @param no recibe parametros
 * @return las columnas  
 * 
 */ 
    public int getColumn() {
        return column;
    }
 /**
 *setColumns metodo que asigna las columnas
 * @param recibe el numero de columnas
 * @return es void por lo tanto no retorna
 * 
 */ 
    public void setColumn(int column) {
        this.column = column;
    }
 /**
 *getNumberWord metodo que obtiene el numero de palabra
 * @param no recibe parametros
 * @return las filas  
 * 
 */ 
    public int getNumberWord() {
        return numberWord;
    }
 /**
 *setNumberWord metodo que asigna el numero de la palabra
 * @param recibe el numero de palabra
 * @return es void por lo tanto no retorna
 * 
 */ 
    public void setNumberWord(int numberWord) {
        this.numberWord = numberWord;
    }
 /**
 *getOrientation metodo que obtiene la orientacion de la palabra
 * @param no recibe parametros
 * @return la orientacion  
 * 
 */ 
    public String getOrientation() {
        return orientation;
    }

        
 /**
 *setOrientation metodo que asigna la orientacion de la palabra
 * @param recibe la orientacion de la palabra
 * @return es void por lo tanto no retorna
 * 
 */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
 /**
 *getLettler metodo que obtiene la letra
 * @param no recibe parametros
 * @return la letra
 * 
 */ 
    public String getWord() {
        return Word;
    }
 /**
 *setLettler metodo que asigna cada letra de la palabra
 * @param recibe las letras de la palabra
 * @return es void por lo tanto no retorna
 * 
 */
    public void setWord(String Word) {
        this.Word = Word;
    }
 /**
 *getWordHelp metodo que obtiene la pista de la palabra
 * @param no recibe parametros
 * @return lla pista de la palabra 
 * 
 */ 
    public String getWordHelp() {
        return wordHelp;
    }
 /**
 *setWordHelp metodo que asigna la pista de cada palabra
 * @param recibe la pista
 * @return es void por lo tanto no retorna
 * 
 */
    public void setWordHelp(String wordHelp) {
        this.wordHelp = wordHelp;
    }
 
    private int row;
    private int column;
    private int numberWord;
    private String orientation;
    private String Word;
    private String wordHelp;
    

    public Word() {
    }
    
    
}

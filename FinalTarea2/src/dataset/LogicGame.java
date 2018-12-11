/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataset;

import view.Game;
import filemanager.ReaderFiletxt;
import java.io.IOException;
import model.CrossWord;
import model.Word;

/**
 *
 * @author Jerry Rivera 
 * @author Maria Rodriguez
 * @author Roibin Elizondo
 */
public class LogicGame {
    Word word = new Word();
    int coutChar = 0;
    ReaderFiletxt reader = new ReaderFiletxt();
    Game game;
    
 /**
 *LGame inicia el juego segun la dificultad escogida por el usuario
 * @param recibe un numero entero por parametros
 * @return es void por lo tanto  no retorna 
 * 
 */

    public void LGame(int level) throws IOException {
        if (level == 1) {
            CrossWord cross = reader.readFileEasy("files/level1/1.txt", 6);
            String[][] matrixGame = makeMatrix(cross);
            
            game.setVisible(true);
        } else {
            if (level == 2) {
                reader.readFileEasy("C:\\Prueba\\facil\\1.txt", 8);
            } else {
                if (level == 3) {
//                    reader.readFile("C:\\Prueba\\facil\\1.txt", 10);
                } else {
//                    reader.readFile("C:\\Prueba\\facil\\1.txt", 12);
                }
            }
        }
    }
    
 /**
 * review metodo que revisa o compara si las letras del crucugrama son iguales a las palabras asignadas, es un metodo recursivo
 * @param recibe la matrizGame, matrixPlayer, WordList, arrayndex, wordCount, correctLetter,row y column
 * @return la operacion recursiva
 * 
 */
    
    public static int review (String [][] matrixGame, String [][] matrixPlayer,Word[] wordList, int arrayIndex, int wordCount, int correctLetter,int row, int column){
        if(wordList[arrayIndex].getOrientation().equals("H")){
            if(matrixGame[ row ][ column].equals(matrixPlayer[ row ][ column ])){
                if(column == wordList[arrayIndex].getLettler().length()-1){
                    if(wordCount == wordList.length-1){
                        return wordCount;
                    }
                        wordCount +=1;
                        return review(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
                }else{
                    correctLetter +=1;
                    return review(matrixGame, matrixPlayer, wordList, arrayIndex, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn()+1);
                }
            }else{
                return review(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
            }
        }else{
            if(matrixGame[ row ][ column].equals(matrixPlayer[ row ][ column ])){
                if( row == wordList[arrayIndex].getLettler().length()-1){
                    if(wordCount == wordList.length-1){
                        return wordCount;
                    }
                    wordCount +=1;
                    return review(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
                }else{
                    correctLetter +=1;
                    return review(matrixGame, matrixPlayer, wordList, arrayIndex, wordCount, correctLetter,wordList[arrayIndex].getRow()+1,wordList[arrayIndex].getColumn());
                }
            }else{
                return review(matrixGame, matrixPlayer, wordList, arrayIndex+1, wordCount, correctLetter,wordList[arrayIndex].getRow(),wordList[arrayIndex].getColumn());
            }
        }
        
    }

    public static String[][] makeMatrix(CrossWord cross) {
        String[][] matrixGame = new String[cross.getRows()][cross.getColumns()];
        for (int i = 0; i < cross.getArrayWord().length; i++) {
            char[] arrayLetter = getArray(cross.getArrayWord()[i].getLettler());
            int row = cross.getArrayWord()[i].getRow();
            int column = cross.getArrayWord()[i].getColumn();

            if (cross.getArrayWord()[i].getOrientation().equals("H")) {
                for (int count = 0; column < arrayLetter.length; column++, count++) {
                    matrixGame[cross.getArrayWord()[i].getRow()][column] = arrayLetter[count] + "";

                }
            } else {
                for (int count = 0 ; count < arrayLetter.length; row++, count++) {
                    matrixGame[row][cross.getArrayWord()[i].getColumn()] = arrayLetter[count] + "";

                }
            }

        }
        return matrixGame;

    }
    
    public static String printMatrix (String [][] matrix){
        String matrixString = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrixString += matrix [i][j];
            }
            matrixString += "\n";
        }
        return matrixString;
    }

    public static char[] getArray(String word) {
        char[] array = word.toCharArray();
        return array;
    }

}

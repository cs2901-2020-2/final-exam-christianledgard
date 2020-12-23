package game;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Tablero {
    ArrayList<ArrayList<Integer>> matrix;
    static final Logger logger = Logger.getLogger(Tablero.class.getName());

    public Tablero() {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            ArrayList<Integer> column = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                column.add(0);
            }
            result.add(column);
        }
        this.matrix = result;
    }

    public void ingresarPiezaEnPosicion(Pieza a, int x, int y){
        for (int i = x, r = 0; i < 3 + x ; i++, r++) {
            for (int j = y, c = 0; j < 3 + y; j++, c++) {
                ArrayList<ArrayList<Integer>> matrixDeLaPieza = a.getMatrix();
                if(matrixDeLaPieza.get(r).get(c) != 0)
                    this.matrix.get(i).set(j, matrixDeLaPieza.get(r).get(c));
            }
        }
    }

    public int getPoints(){
        int subCuadrados = getSubCuadrado() * 150;
        int fila = getFila() * 120;
        int columna = getColumna() * 120;
        return subCuadrados + fila + columna;
    }


    private int getSubCuadrado(){
        int numeroSubCuadrados = 0;

        int partidaX = 0;
        int partidaY = 0;

        for (int l = 0; l < 3; l++) { //SUBCUADRADOS
            for (int m = 0; m < 3; m++) { //SUBCUADRADOS

                int contador = 0;

                for (int j = partidaX; j < partidaX + 3; j++) { //FILAS
                    for (int k = partidaY; k < partidaY + 3; k++) { //COLUMNAS
                        contador += matrix.get(j).get(k);

                    }
                }
                if(contador == 9) numeroSubCuadrados+=1;

                partidaX += 3;
            }
                partidaY = 3;
                partidaX = 0;
        }

        return numeroSubCuadrados;
    }

    private int getFila(){
        int filas = 0;
        for (int i = 0; i < 9; i++) {
            int contador = 0;
            for (int j = 0; j < 9; j++) {
                contador += matrix.get(i).get(j);
            }
            if(contador == 9) filas += 1;
        }
        return filas;
    }

    private int getColumna(){
        int columnas = 0;
        for (int i = 0; i < 9; i++) {
            int contador = 0;
            for (int j = 0; j < 9; j++) {
                contador += matrix.get(j).get(i);
            }
            if(contador == 9) columnas += 1;
        }
        return columnas;
    }

    public boolean isGameOver(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(matrix.get(j).get(i) == 0)
                    return false;
            }
        }
        return true;
    }



    public void print(){
        for (int i = 0; i < 9; i++) {
            System.out.println(matrix.get(i).toString());
        }
    }
}

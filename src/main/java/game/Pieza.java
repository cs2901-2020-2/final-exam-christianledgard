package game;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Pieza {
    ArrayList<ArrayList<Integer>> matrix;
    static final Logger logger = Logger.getLogger(Pieza.class.getName());

    public Pieza(char c) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> column = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                column.add(0);
            }
            result.add(column);
        }
        this.matrix = result;
        setMatrixfromPiezaLetter(c);
    }

    public void setMatrixfromPiezaLetter(char c) {
        switch (c){
            case 'a':
                matrix.get(0).set(0,1);
                matrix.get(1).set(0,1);
                matrix.get(2).set(0,1);
                matrix.get(2).set(1,1);
                matrix.get(2).set(2,1);
                break;
            case 'b':
                matrix.get(0).set(0,1);
                matrix.get(0).set(1,1);
                matrix.get(0).set(2,1);
                matrix.get(1).set(2,1);
                matrix.get(2).set(2,1);
                break;
            case 'c':
                matrix.get(0).set(0,1);
                matrix.get(0).set(1,1);
                matrix.get(0).set(2,1);
                break;
            case 'd':
                matrix.get(0).set(1,1);
                matrix.get(1).set(1,1);
                matrix.get(2).set(1,1);
                break;
            case 'e':
                matrix.get(0).set(1,1);
                matrix.get(1).set(1,1);
                matrix.get(2).set(1,1);
                matrix.get(2).set(0,1);
                matrix.get(2).set(2,1);
                break;
            case 'f':
                matrix.get(0).set(1,1);
                matrix.get(1).set(1,1);
                matrix.get(2).set(1,1);
                matrix.get(0).set(0,1);
                matrix.get(0).set(2,1);
                break;
            case 'g':
                matrix.get(0).set(0,1);
                matrix.get(1).set(0,1);
                matrix.get(2).set(0,1);
                matrix.get(2).set(1,1);
                break;
            case 'h':
                matrix.get(0).set(1,1);
                matrix.get(1).set(1,1);
                matrix.get(2).set(1,1);
                matrix.get(0).set(2,1);
                break;
            default:
                break;
        }

    }

    public void print(){
        for (int i = 0; i < 3; i++) {
            logger.info(matrix.get(i).toString());
        }
    }

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }
}

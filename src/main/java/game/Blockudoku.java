package game;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Blockudoku {
    static final Logger logger = Logger.getLogger(Blockudoku.class.getName());

    public static void main(String[] args){
        logger.info("test");
        Tablero tablero = new Tablero();
        tablero.print();

        ArrayList<Pieza> piezas =  new ArrayList<>();

        initPiezas(piezas);

        while(true){
            logger.info("Bienvenidos al juego");
            tablero.ingresarPiezaEnPosicion(piezas.get(0),0,0);
            logger.info("Puntaje");
            logger.info(String.valueOf(tablero.getPoints()));
            tablero.print();
            break;
        }

    }

    private static void initPiezas(ArrayList<Pieza> piezas) {
        piezas.add(new Pieza('a'));
        piezas.add(new Pieza('b'));
        piezas.add(new Pieza('c'));
        piezas.add(new Pieza('d'));
        piezas.add(new Pieza('e'));
        piezas.add(new Pieza('f'));
        piezas.add(new Pieza('g'));
        piezas.add(new Pieza('h'));


        for (Pieza pieza : piezas){
            pieza.print();
        }
    }

}

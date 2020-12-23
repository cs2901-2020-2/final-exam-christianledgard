package game;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class Blockudoku {
    static final Logger logger = Logger.getLogger(Blockudoku.class.getName());

    public static void main(String[] args){
        logger.info("test");
        Tablero tablero = new Tablero();
        ArrayList<Pieza> piezas =  new ArrayList<>();
        initPiezas(piezas);
        game(tablero, piezas, true);
    }

    private static void game(Tablero tablero, ArrayList<Pieza> piezas, boolean test) {
        logger.info("Bienvenidos al juego");
        while(true){
            tablero.print();
            if (test) break;

            logger.info("Ingrese el número de ficha a insertar");
            Scanner scan = new Scanner(System.in);
            int ficha = scan.nextInt();
            logger.info("Ingrese coodenada X");
            int x = scan.nextInt();
            logger.info("Ingrese coodenada Y");
            int y = scan.nextInt();

            tablero.ingresarPiezaEnPosicion(piezas.get(ficha),x,y);

            logger.info("Su puntaje acutal es ");
            String s =String.valueOf(tablero.getPoints());
            logger.info(s);

            if(tablero.isGameOver()){
                logger.info("--------- GAME OVER ---------");
                break;
            }


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
    }

}

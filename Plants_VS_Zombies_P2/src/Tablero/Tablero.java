package Tablero;

import java.util.*;

/**
 * @author razvanvc
 */
public class Tablero {

    /**
     * Indica el numero de filas del tablero
     */
    public int filas;

    /**
     * Indica el numero de columnas del tablero
     */
    public int columnas;

    /**
     * Indica la Dificultad del juego
     */
    public String dificultad;

    /**
     *
     */
    public Tablero(int filas, int columnas, String dificultad) {
        this.filas = filas;
        this.columnas = columnas;
        this.dificultad = dificultad;
    }

    /**
     *
     */
    public void Renderizar() {
        int FilasT = this.filas;
        int ColumnasT = this.columnas;
        
        for (int i=0;i<ColumnasT;i++){
            for (int z = 0; z<FilasT;z++){
                System.out.println();
                
            }
        }
    }

    /**
     *
     */
    public void ColocarZombie() {
        // TODO implement here
    }

    /**
     *
     */
    public void ColocarGirasol() {
        // TODO implement here
    }

    /**
     *
     */
    public void ColocarLanzaGuisante() {
        // TODO implement here
    }

    /**
     *
     */
    public void Salir() {
        // TODO implement here
    }

    /**
     *
     */
    public void PasarTurno() {
        // TODO implement here
    }

    /**
     *
     */
    public void Ayuda() {
        // TODO implement here
    }

}

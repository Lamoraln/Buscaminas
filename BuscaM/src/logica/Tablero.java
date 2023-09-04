/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Random;
import java.util.Scanner;
import javax.naming.spi.ObjectFactoryBuilder;

/**
 *
 * @author aleja
 */
public class Tablero {

    public Celda[][] celdas;
    private int filas;
    private int columnas;
    private int nivel;
    private int numMinas;
    static Scanner cap;
    public Tablero() {
        this.filas = filas;
        this.columnas = columnas;
        this.numMinas = numMinas;
    }


    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void nivPersonalizado() {
        filas = cap.nextInt();
        columnas = cap.nextInt();
        numMinas = cap.nextInt();
        generarTablero(this.filas, this.columnas, this.numMinas);
    }

    public void configTablero(int nivel) {
        switch (nivel) {
            case 1:
                generarTablero(8, 8, 10);
                break;
            case 2:
                generarTablero(16, 16, 40);
                break;
            case 3:
                generarTablero(16, 30, 99);
                break;
            case 4:
                nivPersonalizado();
                break;
        }
    }

    public void generarTablero(int filas, int columnas, int numMinas) {
        celdas = new Celda[filas][columnas];
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] = new Celda(i, j);
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[0].length; j++) {

                if (j == 0 || j == celdas.length - 1) {
                    if (j == 0) {
                        System.out.print("| " + celdas[i][j]);

                    }
                    if (j == celdas.length - 1) {
                        System.out.print(celdas[i][j] + " |");
                    }
                } else {
                    System.out.print(" " + celdas[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}


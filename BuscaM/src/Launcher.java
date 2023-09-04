
import logica.Tablero;


//import presentacion.Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class Launcher {
    //private Modelo miJuego();

public Launcher(){
    //miJuego = new Modelo();
    //miJuego.iniciar();
}

public static void main(String[] args){
    Tablero tablero = new Tablero();
    tablero.configTablero(1);
    tablero.imprimirTablero();
}
}

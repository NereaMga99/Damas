package org.iesalandalus.programacion.damas.Modelo;

public class Posicion {

    // Creacion de los atributos, los ponemos privados para controlar el acceso y que esté más restringido.
    private int fila;
    private char columna;

    // Creamos el constructor y llamamos al método set con los valores Fila y Columna.
    public Posicion(int fila, char columna) {
        setFila(fila);
        setColumna(columna);
    }

    // Creamos el método getter para devolver el valor
    public int getFila() {
        return fila;
    }

    // Creamos el setter y comprobamos de que el número de Fila sea entre 1 y 8.
    public void setFila(int fila) {
        if (fila < 1 || fila > 8) {
            throw new IllegalArgumentException("Error, la Fila debe estar entre 1 y 8");
        }
        this.fila = fila; // En caso de que no de el error anterior, se modifica el valor de la fila.
    }

    // Aquí creamos el método getter de Columna.
    public char getColumna() {
        return columna;
    }

    //Creamos el setter y comprobamos de que el carácter de Columna sea entre A y H
    public void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
            throw new IllegalArgumentException("Error, la Columna debe estar entre la A y la H");
        }
        this.columna = columna;
    }
}
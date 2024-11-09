package org.iesalandalus.programacion.damas.Modelo;

public enum Direccion {

    // Aqui ponemos las direcciones que habrá en el tablero.
    NORESTE("Noreste"),
    SURESTE("Sureste"),
    SUROESTE("Suroeste"),
    NOROESTE("Noroeste");

    // Creamos el atributo de cadenaAMostrar.
    private final String cadenaAMostrar;

    // Este es el constructor que inicializa el atributo.
    Direccion(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    // Ponemos el método toString que devuelve la representación en cadena.
    public String toString() {
        return cadenaAMostrar;
    }
}


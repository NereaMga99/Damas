package org.iesalandalus.programacion.damas.Modelo;

public enum Color {
    //Ponemos los colores que tendrán las Damas.
    BLANCO ("Blanco"),
    NEGRO ("Negro");

    // Creamos el atributo cadenaAMostrar.
    private final String cadenaAMostrar;

    // Creo el constructor que inicializa el atributo.
    Color (String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }
}

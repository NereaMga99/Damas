package org.iesalandalus.programacion.damas.Modelo;

public class Dama {
    // Definimos los atributos de la clase Dama.
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;

    // Se crea el método Getter para que devuelva el valor de Color.
    public Color getColor() {
        return color;
    }

    // Aquí creamos el método Setter de Color.
    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Error, el color de la Dama no puede ser nulo");
        }
        this.color = color;
    }

    // Se crea el método Getter para que devuelva el valor de Posición.
    public Posicion getPosicion() {
        return posicion;
    }

    // Se crea el método Setter para la Posición de la Dama.
    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("Error, la posición de la Dama no puede ser nula");
        }
        this.posicion = posicion;
    }

    // Aquí creamos el Getter de DamaEspecial (se pone el is para atributos Booleanos).
    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    // Creamos el Setter de DamaEspecial.
    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }
}

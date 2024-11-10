package org.iesalandalus.programacion.damas.Modelo;

public class Dama {
    // Definimos los atributos de la clase Dama.
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;

    // Creamos el constructor por defecto.
    public Dama() {
        this.color = Color.BLANCO;
        this.posicion = crearPosicionInicial(Color.BLANCO);
        this.esDamaEspecial = false;
    }

    // Creamos el constructor que acepta el parámetro Color.
    public Dama(Color color) {
        setColor(color);
        this.posicion = crearPosicionInicial(color);
        this.esDamaEspecial = false;
    }

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

    // Se crea el método para la posición incial de la Dama.
    private Posicion crearPosicionInicial(Color color) {
        int fila;
        char columna;

        //Aqui establecemos el número de fila que tienen que ir las Damas blancas y negras.
        if (color == Color.BLANCO) {
            fila = (int) (Math.random() * 3) + 1;
        } else {
            fila = (int) (Math.random() * 3) + 6;
        }

        // Se comprueba si la fila es par o impar.
        if (fila % 2 == 1) { // Si es impar se crea un Array con las columnas b, d, f, h y entre esas se selecciona 1 aleatorialmente.
            char[] columnasNegras = {'b', 'd', 'f', 'h'};
            columna = columnasNegras[(int) (Math.random() * columnasNegras.length)];

        } else { // Si es par se crea un Array con las columnas a, c, e, g y entre esas se selecciona 1 aleatorialmente.
            char[] columnasNegras = {'a', 'c', 'e', 'g'};
            columna = columnasNegras[(int) (Math.random() * columnasNegras.length)];
        }

        return new Posicion(fila, columna);
    }
}

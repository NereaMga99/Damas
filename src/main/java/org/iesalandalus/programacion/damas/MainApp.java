package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.damas.Modelo.Dama;
import org.iesalandalus.programacion.damas.Modelo.Direccion;
import org.iesalandalus.programacion.damas.Modelo.Color;
import org.iesalandalus.programacion.damas.Modelo.Posicion;
import org.iesalandalus.programacion.utilidades.Entrada;

// Creamos el atributo Dama.
public class MainApp {
    private static Dama dama;

// Se crea el método ejecutarOpcion para que pase como parámetro la opción que elija el usuario.
    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearDamaDefecto();
                break;
            case 2:
                crearDamaColor();
                break;
            case 3:
                mover();
                break;
            case 4:
                Consola.despedirse();
                break;
        }
    }

    // Creamos el método crearDamaDefecto.
    public static void crearDamaDefecto() {
        dama = new Dama();
    }
}

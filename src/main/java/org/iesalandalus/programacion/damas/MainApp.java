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

// Creamos el método main.
public static void main(String[] args) {
    int opcion;

    do {
        // Ponemos la opción de mostrar el menú principal
        Consola.mostrarMenu();
        opcion = Consola.elegirOpcionMenu();

        // Una vez seleccionada la opcion la ejecutamos.
        ejecutarOpcion(opcion);

        // Mostramos la información de la Dama
        mostrarDama();
    } while (opcion != 4);
    System.out.println("Gracias por jugar :) ¡Espero verte de nuevo!");
}

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

    // Creamos el método crearDamaPorDefecto.
    public static void crearDamaDefecto() {
        dama = new Dama();
    }

    // Creamos el método crearDamaColor.
    public static void crearDamaColor() {
        Color colorDama = Consola.elegirOpcion();
        dama = new Dama(colorDama);
    }

    // Creamos el método mover.
    public static void mover() {
        Consola.mostrarMenuDirecciones();

        try {
            Direccion direccion = Consola.elegirDireccion();
            int moverPasos;
            // Verificamos que la Dama es especial y si es Dama normal que mueva solo 1 paso.
            if (dama.isEsDamaEspecial()) {
                System.out.println("Eres una dama especial. ¿Hacia donde quieres mover?");
                moverPasos = Entrada.entero();
                dama.mover(Consola.elegirDireccion(), moverPasos);
            } else {
                moverPasos = 1;
            }
            // Aquí muestra cualquier tipo de error que cometa el programa.
        } catch (OperationNotSupportedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Creamos el método mostrarDama para ver su información (color y posición).
    public static void mostrarDama() {
        if (dama == null) {
            System.out.println("No hay ninguna Dama creada.");
        } else {
            System.out.println("-----Información de la Dama-----");
            System.out.println(dama.toString());
        }
    }
}

package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.Modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola () {

    }

    // Creamos el método mostrarMenú con las opciones que tendrá la aplicación.
    public static void mostrarMenu() {
        System.out.println("----------Menú de opciones----------");
        System.out.println("1. Crear Dama por defecto");
        System.out.println("2. Crear Dama eligiendo el color");
        System.out.println("3. Mover");
        System.out.println("4. Salir");
    }

    // Aquí creamos el método elegirOpcionMenu.
    public static int elegirOpcionMenu() {
        int opcion;
        do {
            System.out.println("Elije una opción: ");
            opcion= Entrada.entero();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
}

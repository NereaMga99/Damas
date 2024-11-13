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

    // Creamos el método elegirOpcion para que elijamos el color de la Dama.
    public static Color elegirOpcion() {
        int colorDama;
        System.out.println("Selecciona 1 para tener la Dama blanca y 2 para tener la Dama negra");
        do { // Esto es lo que se va a repetir mientras se cumpla el while.
            System.out.println("Elije un color para la Dama: ");
            colorDama = Entrada.entero();
        } while (colorDama < 1 || colorDama > 2);
        if (colorDama == 1) { // Aqui hacemos el if ya que si elige el numero 1 automaticamente le devuelve la dama blanca.
            return Color.BLANCO;
        } else { // El else para que si no elige el número 1 lo detecte como el 2 para la dama negra.
            return Color.NEGRO;
        }
    }

    // Creamos el método mostrarMenuDirecciones.
    public static void mostrarMenuDirecciones() {
        System.out.println("----------Menú de direcciones----------");
        System.out.println("1. Noreste");
        System.out.println("2. Sureste");
        System.out.println("3. Suroeste");
        System.out.println("4. Noroeste");
    }
}

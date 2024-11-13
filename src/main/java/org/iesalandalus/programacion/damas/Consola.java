package org.iesalandalus.programacion.damas;

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
        System.out.println("Elige una opción:");
    }

}

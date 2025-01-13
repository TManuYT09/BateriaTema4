package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejecucion();
    }
    public static void ejecucion(){
        imprimirMenu();
        ejecutarOpcion(Pedir.pedirNumero());
        System.out.print("\n");
        finalEjecucion();
    }
    public static void imprimirMenu(){
        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("\t1 - Dígitos");
        System.out.println("\t2 - Potencias");
        System.out.println("\t3 - Del Revés");
        System.out.println("\t4 - Binario");
        System.out.println("\t5 - A binario");
        System.out.println("\t6 - Orden alfabético");
        System.out.println("\t7 - Mostrar suma");
    }
    public static void ejecutarOpcion(int opc){
        switch (opc){
            case 1:Ejercicio1.main(); break;//Hecho
            case 2:Ejercicio2.main(); break;//Hecho
            case 3:Ejercicio3.main(); break;//Hecho
            case 4:Ejercicio4.main(); break;//Hecho
            case 5:Ejercicio5.main(); break;//Hecho
            case 6:Ejercicio6.main(); break;//Hecho
            case 7:Ejercicio7.main(); break;//Hecho
            default:System.out.println("Opción no valida"); break;
        }
    }
    public static void finalEjecucion(){
        System.out.println("Elige una opción:");
        System.out.println("\t[M] - Volver al menú principal");
        System.out.println("\t[X] - Salir");
        String opcion = Pedir.pedirLetra();
        switch (opcion.toUpperCase()){
            case "M": ejecucion(); break;
            case "X": System.exit(0); break;
            default: System.out.println("Opción "+opcion+" no contemplata"); finalEjecucion(); break;
        }
    }
}
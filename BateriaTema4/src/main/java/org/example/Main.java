package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        imprimirMenu();
        int opc=pedirOpcion();
        ejecutarOpcion(opc);
    }
    public static void imprimirMenu(){
        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabético");
        System.out.println("7 - Mostrar suma");
    }
    public static int pedirOpcion(){
        Scanner entrada=new Scanner(System.in);
        return entrada.nextInt();
    }
    public static void ejecutarOpcion(int opc){
        switch (opc){
            case 1:Ejercicio1.main();
                break;
            default:System.out.println("Opción no valida");
                break;
        }
    }
    public static void finalEjecucion(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");
        String opcion = entrada.next();
        if (opcion.equals("M")){
            main();
        }
    }
}
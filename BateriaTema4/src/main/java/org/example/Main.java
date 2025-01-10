package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejecucion();
    }
    public static void ejecucion(){
        imprimirMenu();
        int opc=pedirOpcion();
        ejecutarOpcion(opc);
        finalEjecucion();
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
            case 1:Ejercicio1.main(); break;//Hecho
            case 2:Ejercicio2.main(); break;
            case 3:Ejercicio3.main(); break;
            case 4:Ejercicio4.main(); break;
            case 5:Ejercicio5.main(); break;
            case 6:Ejercicio6.main(); break;
            case 7:Ejercicio7.main(); break;
            default:System.out.println("Opción no valida"); break;
        }
    }
    public static void finalEjecucion(){
        Scanner entrada=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Elige una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");
        String opcion = entrada.next();
        switch (opcion.toUpperCase()){
            case "M": ejecucion(); break;
            case "X": System.exit(0); break;
            default: System.out.println("Opción "+opcion+" no contemplata"); finalEjecucion(); break;
        }
    }
}
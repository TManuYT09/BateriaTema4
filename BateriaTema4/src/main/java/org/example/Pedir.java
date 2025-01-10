package org.example;

import java.util.Scanner;

public class Pedir {
    public static int pedirNumero(){
        Scanner entrada=new Scanner(System.in);
        return entrada.nextInt();
    }
    public static String pedirLetra(){
        Scanner entrada=new Scanner(System.in);
        return entrada.nextLine();
    }
}

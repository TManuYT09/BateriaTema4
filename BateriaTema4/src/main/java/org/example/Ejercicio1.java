package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num=entrada.nextInt();
        int cant=0;
        if (num==0){
            System.out.println(cant);
        }else {
            System.out.println(calculo(num));
        }
    }
    private static int calculo(int num){
        int cant=1;
        while (num>10){
            num=num/10;
            cant++;
        }
        return cant;
    }
}

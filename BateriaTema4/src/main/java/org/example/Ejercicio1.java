package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    static int cantidad=1;
    public static void main(){
        System.out.println("Introduzca un numero");
        int num=pedirNumero();
        if (num==0){
            System.out.println(0);
        }else {
            System.out.println(calculo(num));
        }
    }
    private static int pedirNumero(){
        Scanner entrada=new Scanner(System.in);
        int num=entrada.nextInt();
        return num;
    }
    private static int calculo(int num){
        if (num>=10){
            num=num/10;
            cantidad++;
            return calculo(num);
        } else {
            return cantidad;
        }
    }
}

package org.example;

public class Ejercicio1 {
    static int cantidad;
    public static void main(){
        cantidad=1;
        System.out.println("Introduzca un numero");
        int num=Pedir.pedirNumero();
        if (num==0){
            System.out.println(0);
        }else {
            System.out.println(calculo(num));
        }
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

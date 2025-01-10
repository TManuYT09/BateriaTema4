package org.example;

public class Ejercicio2 {
    static int num2;
    public static void main(){
        System.out.println("Introduzca un numero");
        int num1=Pedir.pedirNumero();
        System.out.println("Introduzca otro numero");
        num2=Pedir.pedirNumero();
        if (num1>=0&&num2>=0){
            if (num2==0){
                System.out.println(1);
            }else {
                System.out.println(calcularResultado(num1));
            }

        }else {
            System.out.println("ERROR");
        }
    }
    private static int calcularResultado(int num){
        int numt=num;
        for (int i = 1; i < num2; i++) {
            num=num*numt;
        }
        return num;
    }
}

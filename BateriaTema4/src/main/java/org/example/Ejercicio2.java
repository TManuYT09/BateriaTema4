package org.example;

public class Ejercicio2 {
    static int num2;
    static int numt;
    public static void main(){
        System.out.println("Introduzca un numero");
        int num1=Pedir.pedirNumero();
        numt=num1;
        System.out.println("Introduzca otro numero");
        num2=Pedir.pedirNumero();
        if (num1>=0&&num2>=0){
            System.out.println("El resultado es "+calcularResultado(num1,1));
        }else {
            System.out.println("ERROR");
        }
    }
    private static int calcularResultado(int num, int cant){
        if (num2!=0){
            if (cant<num2){
                num=num*numt;
                cant++;
                return calcularResultado(num, cant);
            }else {
                return num;
            }
        }else {
            return 1;
        }
    }
}

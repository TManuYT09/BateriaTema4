package org.example;

public class Ejercicio7 {
    static int num;
    public static void main(){
        System.out.println("Introduzca un numero");
        num=Pedir.pedirNumero();
        int resultado=aSumar(1,0);
        System.out.print(" = "+resultado);
        System.out.print("\n");
    }
    private static int aSumar(int suma, int resu){
        if (suma<=num){
            System.out.print(suma);
            if (suma!=num){
                System.out.print(" + ");
            }
            resu+=suma;
            suma++;
            return aSumar(suma,resu);
        }
        return resu;
    }
}

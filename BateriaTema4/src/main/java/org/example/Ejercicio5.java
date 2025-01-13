package org.example;

public class Ejercicio5 {
    public static void main(){
        System.out.println("Introduzca un numero");
        int num=Pedir.pedirNumero();
        String[] bin=pasarBinario(num,"").split("");

        for (int i = bin.length-1; i > -1; i--) {
            System.out.print(bin[i]);
        }
        System.out.print("\n");

    }
    private static String pasarBinario(int num, String bin){
        if (num>=2){
            bin=bin+(num%2);
            num=num/2;
            return pasarBinario(num, bin);
        }
        bin=bin+num;
        return bin;
    }
}

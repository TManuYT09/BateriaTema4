package org.example;

public class Ejercicio4 {
    static String numero;
    public static void main(){
        System.out.println("Introduzca un numero");
        int num = Pedir.pedirNumero();
        numero = String.valueOf(num);
        boolean condicion = comprobarBinario(0);

        if(condicion){
            System.out.println("El numero es binario");
        }else {
            System.out.println("El numero no es binario");
        }
    }
    private static boolean comprobarBinario(int posicion){
        if (posicion<numero.length()){
            if (Integer.valueOf(numero.substring(posicion,posicion+1))!=1 && Integer.valueOf(numero.substring(posicion,posicion+1))!=0){
                return false;
            }else {
                posicion++;
                comprobarBinario(posicion);
            }
        }
        return true;
    }
}

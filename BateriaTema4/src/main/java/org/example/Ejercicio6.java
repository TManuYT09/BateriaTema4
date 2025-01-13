package org.example;

import java.util.Arrays;

public class Ejercicio6 {
    static String palabraOri;
    static String palarbaOrd;
    public static void main(){
        palabraOri="";
        palarbaOrd="";
        System.out.println("Introduzca una palabra");
        palabraOri=Pedir.pedirLetra();
        String[] palabraA=new String[palabraOri.length()];

        for (int i = 0; i < palabraA.length; i++) {
            palabraA[i]=palabraOri.substring(i,i+1);
        }
        Arrays.sort(palabraA);
        for (int i = 0; i < palabraA.length; i++) {
            palarbaOrd=palarbaOrd+palabraA[i];
        }

        if (comprobarOrden(0)){
            System.out.println("Esta ordenada la palabra");
        }else {
            System.out.println("Esta desordenada la palabra");
        }
    }
    private static boolean comprobarOrden(int posicion){
        if (posicion<palabraOri.length()){

            if (palabraOri.substring(posicion).equals(palarbaOrd.substring(posicion))){
                posicion++;
                comprobarOrden(posicion);
            }else {
                return false;
            }
        }
        return  true;
    }
}

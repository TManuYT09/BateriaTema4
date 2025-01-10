package org.example;

public class Ejercicio3 {
    public static void main(){
        System.out.println("¿Que quieres invertir?");
        System.out.println("\t[N] - Número");
        System.out.println("\t[T] - Cadena de texto");
        String opc=Pedir.pedirLetra();
        ejecucionOpcion(opc);
    }
    private static void ejecucionOpcion(String opc){
        switch (opc.toUpperCase()){
            case "N":
                System.out.println("Introduzca un numero");
                int num=Pedir.pedirNumero();
                if (num>0){
                    String numt=String.valueOf(num);
                    System.out.println(mostrarResultado(numt,numt.length()));
                }else {
                    System.out.println("ERROR. Numero no es positivo");
                }
                break;
            case "T":
                System.out.println("Introduzca una cadena de texto");
                String tx=Pedir.pedirLetra();
                System.out.println(mostrarResultado(tx,tx.length()));
                break;
            default:
                System.out.println("ERROR. Opcion inexistente");
                break;
        }
    }
    private static String mostrarResultado(String pedido, int tamano){
        char[] array=pedido.toCharArray();
        if (tamano>0){
            System.out.print(array[tamano-1]);
            tamano--;
            return mostrarResultado(pedido,tamano);
        }else {
            return "";
        }
    }
}

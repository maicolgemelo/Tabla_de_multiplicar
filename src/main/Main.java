package main;
import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int valor = teclado.nextInt();

        int i;

        for(i = 1; i <= 10; i++){

            System.out.println(valor + "x" + i + "=" + (valor * i));
        }

    }
}

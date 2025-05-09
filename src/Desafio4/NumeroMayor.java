package Desafio4;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        int primeroIngresado = 0;
        int segundoIngresado = 0;
        Scanner numeroIngresado = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        primeroIngresado = numeroIngresado.nextInt();
        System.out.println("Ingresa el segundo número: ");
        segundoIngresado = numeroIngresado.nextInt();

        if(primeroIngresado>segundoIngresado){
            System.out.println("El primer número ingresado: " + primeroIngresado +" es mayor");
        }else if (primeroIngresado==segundoIngresado){
            System.out.println("Los 2 números " + primeroIngresado + " y " + segundoIngresado + " son iguales");
        }else{
            System.out.println("El segundo número ingresado: "+ segundoIngresado + " es mayor");
        }

        numeroIngresado.close();
    }
}

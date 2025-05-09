package Desafio3;

import java.util.Scanner;

public class Accesos {
    public static void main(String[] args) {
        Scanner clave = new Scanner(System.in);
        System.out.println("Ingrese la constraseña: ");
        int claveIngresada = clave.nextInt();

        if (claveIngresada == 123456){
            System.out.println("¡Acceso Permitido!");
        }else{
            System.out.println("¡Acceso Denegado!");
        }
    }
}

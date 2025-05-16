package Desafio8;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner lado = new Scanner(System.in);

        System.out.println("Ingrese el primer lado: ");
        int primerLado = lado.nextInt();
        System.out.println("Ingreso el segundo lado: ");
        int segundoLado = lado.nextInt();
        System.out.println("Ingrese el tercer lado: ");
        int tercerLado = lado.nextInt();

        int sumaLados1 = primerLado + segundoLado;
        int sumaLados2 = primerLado + tercerLado;
        int sumaLados3 = segundoLado + tercerLado;

        if(sumaLados1 > tercerLado && sumaLados2 >segundoLado && sumaLados3 >primerLado){
            System.out.println("Los lados pueden formar un triángulo");
        } else {
            System.out.println("Los lados no pueden formar un triángulo");
        }
        lado.close();
    }
}

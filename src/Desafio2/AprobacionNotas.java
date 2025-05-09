package Desafio2;

import java.util.Scanner;

public class AprobacionNotas {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Ingresa el promedio final del estudiante:");
        double promedioFinal = nota.nextDouble();

        if (promedioFinal >= 7){
            System.out.println("El estudiante ha aprobado la asignatura");
        } else if (promedioFinal >= 5.0 && promedioFinal <= 6.9) {
            System.out.println("El estudiante está en recuperación");
        }else{
            System.out.println("El estudiante está reprobado");
        }


    }
}

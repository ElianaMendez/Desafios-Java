package Desafio6;

import java.util.Scanner;

public class DiasHabiles {
    public static void main(String[] args) {
        Scanner diaSemana = new Scanner(System.in);

        System.out.println("Ingrese el dia de la semana (en minusculas): ");
        String diaIngresado = diaSemana.nextLine();

        if (diaIngresado.equals("lunes") || diaIngresado.equals("martes") || diaIngresado.equals("miércoles") || diaIngresado.equals("jueves")
        || diaIngresado.equals("viernes")){
            System.out.println(diaIngresado + " es un día hábil");
        }else{
            System.out.println(diaIngresado + " no es un día hábil");
        }
    }
}

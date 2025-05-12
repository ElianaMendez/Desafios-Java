package Desafio7;

import java.util.Scanner;

public class prestamoBancario {
    public static void main(String[] args) {
        Scanner prestamo = new Scanner(System.in);
        int montoMinimo = 1000;
        int montoMaximo = 5000;

        System.out.println("Ingrese el valor del préstamo: ");
        int montoSolicitado = prestamo.nextInt();

        if(montoSolicitado>=montoMinimo && montoSolicitado<=montoMaximo){
            System.out.println("Perfecto!. El valor de " + montoSolicitado + " está dentro del intérvalo permitido para el préstamo");
        }else{
            System.out.println("El valor de " + montoSolicitado + " no está dentro del intérvalo permitido para el préstamo. Por favor ingresa un nuevo monto.");
        }

        prestamo.close();
    }
}

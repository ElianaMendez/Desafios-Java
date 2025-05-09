package Desafio1;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numeroIngresado = scanner.nextInt();

        if(numeroIngresado %2 == 0){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es impar");
        }
    }
}

package Desafio9;

import java.util.Scanner;

public class DonanteSangre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el peso del donante (en kg): ");
        int peso = scanner.nextInt();

        boolean edadPermitida = edad>=18 && edad<=65;
        boolean pesoPermitido = peso>50;

        if(edadPermitida && pesoPermitido){
            System.out.println("Felicitaciones! El donante es compatible");
        } else if (!edadPermitida && pesoPermitido) {
            System.out.println("El donante no es compatible");
            System.out.println("Motivo: Debe tener entre 18 y 65 años");
        }else if(edadPermitida && !pesoPermitido){
            System.out.println("El donante no es compatible");
            System.out.println("Motivo: Debe pesar mas de 50 kilogramos");
        }else{
            System.out.println("El donante no es compatible");
            System.out.println("Motivo: Debe tener entre 18 y 65 años y pesar más de 50 kilogramos");
        }

        scanner.close();
    }
}

package Desafio10;

import java.util.Scanner;

public class SecureAccess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codigoCorrecto = 2023;
        int permisoValidoMinimo = 1;
        int permisoValidoMaximo = 3;

        System.out.println("Ingrese el código de acceso: ");
        int codigoIngresado = scanner.nextInt();

        System.out.println("Ingrese el nivel de permiso: ");
        int permisoIngresado = scanner.nextInt();

        boolean codigoValido = codigoIngresado == codigoCorrecto;
        boolean permisoValido = permisoIngresado >=permisoValidoMinimo && permisoIngresado <=permisoValidoMaximo;

        if (codigoValido && permisoValido){
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        }else{
            System.out.println("Acceso denegado!");
            if(!codigoValido){
                System.out.println("Motivo: El código de acceso no es correcto");
            }
            if(!permisoValido){
                System.out.println("Motivo: El nivel de permiso solicitado no es correcto");
            }
        }

        scanner.close();

    }
}

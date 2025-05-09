package Desafio5;

import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {
        double descuento = 0.1;
        double compraMinina = 100.00;
        Scanner valorCompra = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra: ");
        double compra = valorCompra.nextDouble();

        if(compra>=compraMinina){
            System.out.println("Descuento del 10% aplicado");
            double descuentoAplicado = compra * descuento;
            double nuevoValorCompra = compra - descuentoAplicado;
            System.out.println("Nuevo valor: " + nuevoValorCompra);
        }else{
            System.out.println("Descuento no aplicado");
            System.out.println("Valor total: " + compra);
        }
    }
}

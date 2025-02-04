package ud2.ejercicioscondicionales;

import java.util.Scanner;
/*
 * Factura (Factura.java). Escribe un programa para emitir la factura de compra de un producto
 * introduciendo el precio del producto y el número de unidades compradas. La factura deberá añadir
 * al total un IVA (Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100
 * euros se aplicará un descuento del 5%.
 * Ejemplos para pruebas:
 * ● Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
 * ● Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €
 */

public class Factura {
    public static void main(String[] args) {
        final double IVA = 0.21;
        final double DESCUENTO = 0.05;
        final double MAXIMO_PRECIO = 100.0;
        double precioProducto;
        int unidadesCompradas;
        double precioFinalSinIVA;
        double precioFinalConIVA;
        double precioConDescuento;
              
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio de tu producto: ");
        precioProducto = sc.nextDouble();
        System.out.print("Introduce el número de unidades compradas: ");
        unidadesCompradas = sc.nextInt();
        sc.close();

        precioFinalSinIVA = precioProducto * unidadesCompradas;
        precioFinalConIVA = precioFinalSinIVA + (precioFinalSinIVA * IVA);

        if (precioFinalConIVA > MAXIMO_PRECIO) {
            precioConDescuento = precioFinalConIVA - (precioFinalConIVA * DESCUENTO);
            System.out.printf("El precio final de tu producto es: %.2f y has obtenido un descuento.\n", precioConDescuento);
        } else {
            System.out.printf("El precio final de tu producto es %.2f y no has obtenido ningún descuento.\n", precioFinalConIVA);
        }
    }
}

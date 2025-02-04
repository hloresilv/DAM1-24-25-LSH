package ud1.ejercicios.lsh20241004;

import java.util.Scanner;

/*
 * EP0117. Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar 
 * el número de patas que tienen en total todos los animales capturados durante una jornada de trabajo.
 * Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
 * El número de hormigas capturadas (6 patas).
 * El número de arañas capturadas (8 patas).
 * El número de cochinillas capturadas (14 patas).
 * La aplicación debe mostrar el número total de patas.
*/
public class EP0117 {
    public static void main(String[] args) {
        int hormigas;
        int aranas;
        int cochinillas;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce el número de hormigas capturadas: ");
            hormigas = sc.nextInt();
            System.out.println("Introduce el número de aranas capturadas: ");
            aranas = sc.nextInt();
            System.out.println("Introduce el número de cochinillas capturadas: ");
            cochinillas = sc.nextInt();
        }

        int patasHormigas = hormigas * 6;
        int patasAranas = aranas * 8;
        int patasCochinillas = cochinillas * 14;

        int totalPatas = patasHormigas + patasAranas + patasCochinillas;
        System.out.println("El total de patas es: " + totalPatas);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package problema04;

import java.util.Locale;
import java.util.Scanner;

public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int posicion = 1;
        int numerador = 1;
        int denominador = 1;
        int signo = 1;

        double termino;
        double suma = 0;

        String reporte = "";

        while (posicion <= 8) {

            termino = (double) numerador / denominador;
            termino = termino * signo;

            suma = suma + termino;

            if (posicion == 1) {
                reporte = reporte + "1/1";
            } else {
                if (signo == 1) {
                    reporte = reporte + " + 1/" + denominador;
                } else {
                    reporte = reporte + " - 1/" + denominador;
                }
            }

            denominador = denominador + 2;
            signo = signo * (-1);
            posicion++;
        }

        System.out.println("Serie: " + reporte);
        System.out.printf("Resultado: %.7f%n", suma);

        entrada.close();
    }
}
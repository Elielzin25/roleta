package br.senai.sp.roleta;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta Russo
 * Data: 17/08/2023
 * Autor Eliel Armando
 *
 * */

public class roleta {

    public static void main(String[] args) {

        /**criar variaveis*/

        int number;
        int random;
        boolean continuar = true;

        /**instancior*/

        Scanner teclado = new Scanner(System.in);

        /**instanciar rondom*/
        Random aleatorio = new Random();

        while (continuar) {
            /** coletar dados*/

            System.out.println("---------------------");
            System.out.println("---------------bem vindo!-----------------");
            System.out.println("Digite um numero:");
            number = teclado.nextInt();
            System.out.println("-----------------------");

            random = aleatorio.nextInt(10) + 1;

            if (random == number) {

                continuar = false;
            }
        }
        System.out.println("parabens voce ganhou");

    }
}

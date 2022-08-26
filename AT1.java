/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prova1;

import java.util.Scanner;

/**
 *
 * @author Vidal Reis
 */
public class AT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];
        int cont;

        for (int i = 0; i < 5; i++) {
            System.out.println("insira o " + (i + 1) + "º número");
            vetor[i] = sc.nextInt();
        }

        if (((vetor[0] > vetor[1]) && (vetor[0] > vetor[2]) && (vetor[0] > vetor[3]) && (vetor[0] > vetor[4]))) {
            System.out.println("O maior deles é: " + vetor[0]);
        } else if (((vetor[0] < vetor[1]) && (vetor[0] < vetor[2]) && (vetor[0] < vetor[3]) && (vetor[0] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[0]);
            System.exit(0);
        } else if (((vetor[1] < vetor[0]) && (vetor[1] < vetor[2]) && (vetor[1] < vetor[3]) && (vetor[1] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[1]);
            System.exit(0);
        } else if (((vetor[2] < vetor[0]) && (vetor[2] < vetor[3]) && (vetor[2] < vetor[4]) && (vetor[2] < vetor[1]))) {
            System.out.println("O menor deles é: " + vetor[2]);
            System.exit(0);
        } else if (((vetor[3] < vetor[0]) && (vetor[3] < vetor[1]) && (vetor[3] < vetor[2]) && (vetor[3] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[3]);
            System.exit(0);
        } else if (((vetor[4] < vetor[1]) && (vetor[4] < vetor[2]) && (vetor[4] < vetor[3]) && (vetor[4] < vetor[0]))) {
            System.out.println("O menor deles é: " + vetor[4]);
            System.exit(0);
        }
        if (((vetor[1] > vetor[0]) && (vetor[1] > vetor[2]) && (vetor[1] > vetor[3]) && (vetor[1] > vetor[4]))) {
            System.out.println("O maior deles é: " + vetor[1]);
        } else if (((vetor[0] < vetor[1]) && (vetor[0] < vetor[2]) && (vetor[0] < vetor[3]) && (vetor[0] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[0]);
            System.exit(0);
        } else if (((vetor[1] < vetor[0]) && (vetor[1] < vetor[2]) && (vetor[1] < vetor[3]) && (vetor[1] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[1]);
            System.exit(0);
        } else if (((vetor[2] < vetor[0]) && (vetor[2] < vetor[3]) && (vetor[2] < vetor[4]) && (vetor[2] < vetor[1]))) {
            System.out.println("O menor deles é: " + vetor[2]);
            System.exit(0);
        } else if (((vetor[3] < vetor[0]) && (vetor[3] < vetor[1]) && (vetor[3] < vetor[2]) && (vetor[3] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[3]);
            System.exit(0);
        } else if (((vetor[4] < vetor[1]) && (vetor[4] < vetor[2]) && (vetor[4] < vetor[3]) && (vetor[4] < vetor[0]))) {
            System.out.println("O menor deles é: " + vetor[4]);
            System.exit(0);
        }
        if (((vetor[2] > vetor[0]) && (vetor[2] > vetor[3]) && (vetor[2] > vetor[4]) && (vetor[2] > vetor[1]))) {
            System.out.println("O maior deles é: " + vetor[2]);
        } else if (((vetor[0] < vetor[1]) && (vetor[0] < vetor[2]) && (vetor[0] < vetor[3]) && (vetor[0] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[0]);
            System.exit(0);
        } else if (((vetor[1] < vetor[0]) && (vetor[1] < vetor[2]) && (vetor[1] < vetor[3]) && (vetor[1] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[1]);
            System.exit(0);
        } else if (((vetor[2] < vetor[0]) && (vetor[2] < vetor[3]) && (vetor[2] < vetor[4]) && (vetor[2] < vetor[1]))) {
            System.out.println("O menor deles é: " + vetor[2]);
            System.exit(0);
        } else if (((vetor[3] < vetor[0]) && (vetor[3] < vetor[1]) && (vetor[3] < vetor[2]) && (vetor[3] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[3]);
            System.exit(0);
        } else if (((vetor[4] < vetor[1]) && (vetor[4] < vetor[2]) && (vetor[4] < vetor[3]) && (vetor[4] < vetor[0]))) {
            System.out.println("O menor deles é: " + vetor[4]);
            System.exit(0);
        }
        if (((vetor[3] > vetor[0]) && (vetor[3] > vetor[1]) && (vetor[3] > vetor[2]) && (vetor[3] > vetor[4]))) {
            System.out.println("O maior deles é: " + vetor[3]);
        } else if (((vetor[0] < vetor[1]) && (vetor[0] < vetor[2]) && (vetor[0] < vetor[3]) && (vetor[0] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[0]);
            System.exit(0);
        } else if (((vetor[1] < vetor[0]) && (vetor[1] < vetor[2]) && (vetor[1] < vetor[3]) && (vetor[1] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[1]);
            System.exit(0);
        } else if (((vetor[2] < vetor[0]) && (vetor[2] < vetor[3]) && (vetor[2] < vetor[4]) && (vetor[2] < vetor[1]))) {
            System.out.println("O menor deles é: " + vetor[2]);
            System.exit(0);
        } else if (((vetor[3] < vetor[0]) && (vetor[3] < vetor[1]) && (vetor[3] < vetor[2]) && (vetor[3] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[3]);
            System.exit(0);
        } else if (((vetor[4] < vetor[1]) && (vetor[4] < vetor[2]) && (vetor[4] < vetor[3]) && (vetor[4] < vetor[0]))) {
            System.out.println("O menor deles é: " + vetor[4]);
            System.exit(0);
        }
        if (((vetor[4] > vetor[1]) && (vetor[4] > vetor[2]) && (vetor[4] > vetor[3]) && (vetor[4] > vetor[0]))) {
            System.out.println("O maior deles é: " + vetor[4]);
        } else if (((vetor[0] < vetor[1]) && (vetor[0] < vetor[2]) && (vetor[0] < vetor[3]) && (vetor[0] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[0]);
            System.exit(0);
        } else if (((vetor[1] < vetor[0]) && (vetor[1] < vetor[2]) && (vetor[1] < vetor[3]) && (vetor[1] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[1]);
            System.exit(0);
        } else if (((vetor[2] < vetor[0]) && (vetor[2] < vetor[3]) && (vetor[2] < vetor[4]) && (vetor[2] < vetor[1]))) {
            System.out.println("O menor deles é: " + vetor[2]);
            System.exit(0);
        } else if (((vetor[3] < vetor[0]) && (vetor[3] < vetor[1]) && (vetor[3] < vetor[2]) && (vetor[3] < vetor[4]))) {
            System.out.println("O menor deles é: " + vetor[3]);
            System.exit(0);
        } else if (((vetor[4] < vetor[1]) && (vetor[4] < vetor[2]) && (vetor[4] < vetor[3]) && (vetor[4] < vetor[0]))) {
            System.out.println("O menor deles é: " + vetor[4]);
            System.exit(0);
        }
    }
}

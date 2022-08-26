/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1;

import java.util.Scanner;

/**
 *
 * @author Vidal Reis
 */
public class AT3a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double massa, finalms = 0;
        int sec = 0;
        System.out.println("Insira a massa em gramas");
        massa = sc.nextDouble();
        int hora, min, secc;

        do {
            finalms = (massa / 2);
            massa = finalms;
            sec = sec + 50;
        } while (massa > 0.5);
        int s = sec * 50;
        hora = (s / 3600);
        min = ((s - (hora * 3600)) / 60);
        secc = (s - (hora * 3600) + (min * 60));
        System.out.println(massa);
        System.out.println(sec);
        System.out.println();
        System.out.println(hora);
        System.out.println(min);
        System.out.println(secc);
    }
}

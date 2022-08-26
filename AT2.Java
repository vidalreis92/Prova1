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
public class AT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1995;
        double salb = 1000;
        double perc = 0;
        double per = 1.5;
        double sala = 0, salaf = 0, sal = 0;
        int cont = 0;
        do {
            perc = ((perc * cont));
            sala = ((salb * perc) / 100);
            salaf = (sala + salb);
            salb = (salaf);
            perc = (per);
            cont++;
            i++;
        } while (i <= 2022);
        System.out.println("O salário em 2022 será: " + salb + " R$");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parouimpar;

import java.util.Scanner;

public class ParouImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar um número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Determinar se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }

        // Fechar o scanner
        scanner.close();
    }
}


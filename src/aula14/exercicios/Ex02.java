package aula14.exercicios;

import java.util.Scanner;

public class Ex02 {

    //Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        if (num1 > 0) {
            System.out.println("o " + num1 + " é positivo");
        } else {
            System.out.println("o " + num1 + " é negativo");
        }
    }
}

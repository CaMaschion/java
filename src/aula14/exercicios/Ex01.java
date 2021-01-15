package aula14.exercicios;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){
        //faça um programa que peça dois números e imprima o maior deles
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número :");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("o maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}

package aula14.exercicios;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é F ou M. Conforme a letra escrever: F - feminino,
// M - masculino. Sexo inválido

public class Ex03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String sexo = scan.next();

        if ( sexo.equalsIgnoreCase("F")) {
            System.out.println("feminina");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("masculino");
        } else {
            System.out.println("sexo inválido");
        }
    }
}

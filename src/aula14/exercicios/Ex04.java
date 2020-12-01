package aula14.exercicios;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é vogal ou consoante

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.next();

        if ( letra.equalsIgnoreCase("a") ||
        letra.equalsIgnoreCase("e") ||
        letra.equalsIgnoreCase("i") ||
        letra.equalsIgnoreCase("o") ||
        letra.equalsIgnoreCase("u")) {
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        }
    }
}

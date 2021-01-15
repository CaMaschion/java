package aula14.exercicios;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota1 = scan.nextInt();

        System.out.println("Digite sua nota: ");
        double nota2 = scan.nextInt();

        double media = (nota1 + nota2) / 2;

        if(media == 10 ){
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else  {
            System.out.println("Reprovado");
        }
    }

}

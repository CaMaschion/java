package aula14.exercicios;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, numero2, numero3;

        System.out.println("Insira um valor: ");
        numero = scan.nextInt();

        System.out.println("Insira outro valor: ");
        numero2 = scan.nextInt();

        System.out.println("Insira mais um valor: ");
        numero3 = scan.nextInt();


        if (numero <= numero2 && numero <= numero3 && numero2 <= numero3) {
            System.out.println(numero3 + " - " + numero2 + " - " + numero);

        } else if (numero2 <= numero && numero <= numero3 && numero3 <= numero2) {
            System.out.println(numero2 + " - " + numero3 + " - " + numero);

        } else if (numero3 <= numero && numero3 <= numero2 && numero <= numero2) {
            System.out.println(numero + " - " + numero2 + " - " + numero3);
        }
    }
}

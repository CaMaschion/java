package aula14.exercicios;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Em que turno você estuda? Entre com valores M - V ou N");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Bom tarde");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Valor inválido");
        }
    }

}

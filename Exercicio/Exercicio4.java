package Exercicio;

//4. Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("Digite um numero: ");
        Scanner INPUT = new Scanner(System.in);
        int valor = INPUT.nextInt();

        System.out.println("Digite um numero: ");
        Scanner INPUT2 = new Scanner(System.in);
        int valor2 = INPUT2.nextInt();

        list.add(valor);
        list.add(valor2);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("----------------------------------------");
        System.out.println("Lista de numeros em ordem decrescente: "+ list);

    }

}

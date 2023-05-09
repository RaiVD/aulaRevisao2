package Exercicio;

//3. Faça um programa que contenha um método que receba o tamanho de uma lista como parâmetro e que retorne a lista com a capacidade inicial recebida pelo usuário.
//Logo depois faça um método que adicione valores nessa lista,os valores devem serrem cebidos pelo usuário respeitando a capacidade inicial além disso esse método deve
//retornar true caso a adição seja bem sucedida e false caso o contrário. Por fim um método que retorna a média aritmética dos números armazenados na lista.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Digite um parâmetro para a sua lista: ");
        parametrodaLista();

        System.out.println("----------------------------------------");
        System.out.println("Digite um valor");
        listadeNumeros(parametrodaLista());


    }
    public static int parametrodaLista () {
        Scanner parametro = new Scanner(System.in);
        int valor = parametro.nextInt();

        return valor;
    }
    public static List <Integer> listadeNumeros(int i) {
        Scanner valores = new Scanner(System.in);
        int num = valores.nextInt();

        List<Integer> list = new ArrayList<>(i);

        list.add(num);
        System.out.println(list);

        return list;
    }

}

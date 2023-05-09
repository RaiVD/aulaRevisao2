package Exercicio;

//3. Faça um programa que contenha um método que receba o tamanho de uma lista como parâmetro e que retorne a lista com a capacidade inicial recebida pelo usuário.
//Logo depois faça um método que adicione valores nessa lista,os valores devem serrem cebidos pelo usuário respeitando a capacidade inicial além disso esse método deve
//retornar true caso a adição seja bem sucedida e false caso o contrário. Por fim um método que retorna a média aritmética dos números armazenados na lista.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        System.out.println("Digite um parâmetro para a sua lista: ");
        int tamanhoLista = valores.nextInt();
        List<Integer> listNumeros = retornarNumero(tamanhoLista);

        adicionarValorLista(listNumeros,tamanhoLista);

        System.out.println("A media dos valores é: "+ mediaAritimeticaLista(listNumeros));

    }
    public static List <Integer> retornarNumero(int tamanhoLista) {

        List<Integer> list = new ArrayList<>(tamanhoLista);


        return list;
    }
    public static Boolean adicionarValorLista(List<Integer> list, int tamanhoLista){
        Scanner entrar = new Scanner(System.in);

        for(int i = 0; i < tamanhoLista; i++){

            System.out.println("Digite o "+ (i + 1)+" valor:");
            list.add(entrar.nextInt());
        }
        return true;
    }
    public static double mediaAritimeticaLista(List<Integer>list){
        double media = 0;

        for(int i =0; i < list.size(); i++){
          media = media + list.get(i);
        }

        media = media/list.size();

        return media;
    }

}

package Exercicio;

//1. Escreva um programa para remover um elemento específico de uma lista.

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add(0,"Raissa");
        nomes.add(1,"Ana");
        nomes.add(2,"Paula");
        nomes.add(3,"Larissa");
        nomes.add(4,"Maisa");
        System.out.println("Lista de nomes: "+nomes);

        System.out.println("------------------------------------------------");

        nomes.remove(3);
        nomes.remove(1);
        System.out.println("Lista de nome atual: " + nomes);
    }
}

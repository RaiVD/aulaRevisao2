package Exercicio;

// 2.Escreva um programa para inserir um elemento (posição específica) em uma lista.

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Raissa");
        nomes.add("Ana");
        nomes.add("Paula");
        nomes.add("Larissa");
        nomes.add("Maisa");
        System.out.println("Lista de nomes: " + nomes);

        System.out.println("============================================================");

        nomes.add(3,"Maria");
        nomes.add(0,"Maria");
        System.out.println("Lista de nomes atualizada: " + nomes);
    }
}

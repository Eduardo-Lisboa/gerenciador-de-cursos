package br.com.alura.test;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de lista";
        String aula2 = "Modelando a classe Auala";
        String aula3 = "Trabalahando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);


        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);

        System.out.println("Primeira aula é: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        System.out.println(aulas.size());

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:" + aula);
        });

        aulas.add("Aumentado nosso seu conhecimento");

        System.out.println(aulas);

        Collections.sort(aulas);


        System.out.println(aulas);
    }
}

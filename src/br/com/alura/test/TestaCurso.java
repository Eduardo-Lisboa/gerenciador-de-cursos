package br.com.alura.test;

import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Colecoes", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalho com ArrayList", 25));
        javaColecoes.adiciona(new Aula("Criando Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando Colecoes", 22));

        List<Aula> aulasImutavies = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasImutavies);

        Collections.sort(aulas);

        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);




    }
}

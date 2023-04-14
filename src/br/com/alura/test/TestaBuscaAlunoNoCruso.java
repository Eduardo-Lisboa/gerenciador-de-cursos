package br.com.alura.test;

import br.com.alura.model.Aluno;
import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

public class TestaBuscaAlunoNoCruso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Colecoes", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalho com ArrayList", 25));
        javaColecoes.adiciona(new Aula("Criando Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando Colecoes", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);


        System.out.println("Quem e o aluno com matricula 5617?");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " + aluno);
    }
}

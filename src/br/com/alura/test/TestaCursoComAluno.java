package br.com.alura.test;

import br.com.alura.model.Aluno;
import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

public class TestaCursoComAluno {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno " + a1 + " esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        String nome = "Rodrigo Turini";
        System.out.println("E esse Turini, esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));


        System.out.println(a1.hashCode() == turini.hashCode());
    }
}

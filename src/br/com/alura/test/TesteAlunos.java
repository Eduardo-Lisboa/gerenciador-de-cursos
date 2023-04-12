package br.com.alura.test;

import java.util.ArrayList;
import java.util.Collection;

import java.util.HashSet;
import java.util.List;


public class TesteAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio");
        alunos.add("Alberto Souza");

//        for(String aluno : alunos){
//            System.out.println(aluno);
//        }


        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);

        alunos.remove("Sergio Lopes");

        alunos.forEach(aluno -> {
            System.out.println("Aluno: " + aluno);
        });

        System.out.println(alunos.size());

        System.out.println(alunos);


        List<String> alunosEmLista = new ArrayList<String>(alunos);
    }
}

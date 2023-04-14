package br.com.alura.model;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int numeroDaMatricula;

    public Aluno(String nome, int numeroDaMatricula) {
        if (nome == null){
            throw new NullPointerException("Nome nao pode ser nulo");
        }
        this.nome = nome;
        this.numeroDaMatricula = numeroDaMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDaMatricula() {
        return numeroDaMatricula;
    }

    @Override
    public String toString() {
        return "{Aluno: " + this.nome + ", matricula: " + this.numeroDaMatricula + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
